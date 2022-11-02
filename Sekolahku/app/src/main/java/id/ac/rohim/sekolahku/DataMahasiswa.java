package id.ac.rohim.sekolahku;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.AdapterView.OnItemClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class DataMahasiswa extends AppCompatActivity {
    String[] daftar;
    ListView ListView01;
    Menu menu;
    protected Cursor cursor;
    DataHelper dbCenter;
    public static DataMahasiswa da;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datamahasiswa);
        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(DataMahasiswa.this, InputData.class);
                startActivity(intent);
            }
        });
        da = this;
        dbCenter = new DataHelper(this);
        RefreshList();
    }
    public void RefreshList(){
        SQLiteDatabase db = dbCenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM biodata",null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc = 0; cc < cursor.getCount(); cc++) {
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(1).toString();
        }
        ListView01 = (ListView) findViewById(R.id.list_view1);
        ListView01.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,daftar));
        ListView01.setSelected(true);
        ListView01.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                final  String selection = daftar[arg2];
                final CharSequence[] dialogItem = {"Lihat Data","Update Data","Hapus Data"};
                AlertDialog.Builder builder = new AlertDialog.Builder(DataMahasiswa.this);
                builder.setTitle("Pilihan");
                builder.setItems(dialogItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int item) {
                        switch (item) {
                            case 0 :
                                Intent i = new Intent(getApplicationContext(),DetailData.class);
                                i.putExtra("nama", selection);
                                startActivity(i);
                            break;
                            case 1 :
                                Intent in = new Intent(getApplicationContext(),UpdateData.class);
                                in.putExtra("nama", selection);
                                startActivity(in);
                                break;
                            case 2 :
                                SQLiteDatabase db = dbCenter.getWritableDatabase();
                                db.execSQL("delete from biodata where nama = ''"+selection);
                                RefreshList();
                                break;
                        }
                    }
                });
                builder.create().show();
            }
        });
        ((ArrayAdapter)ListView01.getAdapter()).notifyDataSetInvalidated();
    }
}