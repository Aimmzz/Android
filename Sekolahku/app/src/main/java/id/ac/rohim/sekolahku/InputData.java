package id.ac.rohim.sekolahku;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputData extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton1;
    EditText text1, text2, text3, text4, text5;
    String edit;
    TextView textV1, textV2, textV3, textV4, textV5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);
        dbHelper = new DataHelper(this);
        text1 = (EditText) findViewById(R.id.edit_text1);
        text2 = (EditText) findViewById(R.id.edit_text2);
        text3 = (EditText) findViewById(R.id.edit_text3);
        text4 = (EditText) findViewById(R.id.edit_text4);
        text5 = (EditText) findViewById(R.id.edit_text5);
        textV1 = (TextView) findViewById(R.id.text_view1);
        textV2 = (TextView) findViewById(R.id.text_view2);
        textV3 = (TextView) findViewById(R.id.text_view3);
        textV4 = (TextView) findViewById(R.id.text_view4);
        textV5 = (TextView) findViewById(R.id.text_view5);
        ton1 = (Button) findViewById(R.id.button1);
        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                edit = text1.getText().toString();
                edit = text2.getText().toString();
                edit = text3.getText().toString();
                edit = text4.getText().toString();
                edit = text5.getText().toString();
                if (edit.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong...",
                            Toast.LENGTH_SHORT).show();
                } else {
                    db.execSQL("insert into biodata(nomer, nama, tgl, jk, alamat)values('"+
                            text1.getText().toString() + "','"+
                            text2.getText().toString() + "','"+
                            text3.getText().toString() + "','"+
                            text4.getText().toString() + "','"+
                            text5.getText().toString() + "',')");
                    Toast.makeText(getApplicationContext(),"Data Tersimpan...",Toast.LENGTH_LONG).show();
                    finish();
                }
                DataMahasiswa.da.RefreshList();
            }
        });
    }
}