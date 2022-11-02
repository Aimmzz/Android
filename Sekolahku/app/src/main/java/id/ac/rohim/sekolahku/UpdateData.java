package id.ac.rohim.sekolahku;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class UpdateData extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton1;
    EditText text1, text2, text3, text4, text5;
    String edit;
    TextView textV1,textV2,textV3,textV4,textV5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);
        dbHelper = new DataHelper(this);
        text1 = (EditText) findViewById(R.id.edit_text1);
        text2 = (EditText) findViewById(R.id.edit_text2);
        text3 = (EditText) findViewById(R.id.edit_text3);
        text4 = (EditText) findViewById(R.id.edit_text4);
        text5 = (EditText) findViewById(R.id.edit_text5);
        textV1=(TextView)findViewById(R.id.text_view1);
        textV2=(TextView)findViewById(R.id.text_view2);
        textV3=(TextView)findViewById(R.id.text_view3);
        textV4=(TextView)findViewById(R.id.text_view4);
        textV5=(TextView)findViewById(R.id.text_view5);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM biodata WHERE nama = '" +
                getIntent().getStringExtra("nama") + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            text1.setText(cursor.getString(0).toString());
            text2.setText(cursor.getString(1).toString());
            text3.setText(cursor.getString(2).toString());
            text4.setText(cursor.getString(3).toString());
            text5.setText(cursor.getString(4).toString());
        }
        ton1 = (Button) findViewById(R.id.button1);
        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                edit = text1.getText().toString();
                edit=text2.getText().toString();
                edit=text3.getText().toString();
                edit=text4.getText().toString();
                edit=text5.getText().toString();
                if(edit.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong...",Toast.LENGTH_SHORT).show();
                } else{
                    db.execSQL("update biodata set nama='"+
                            text2.getText().toString() +"', tgl='" +
                            text3.getText().toString()+"', jk='"+
                            text4.getText().toString() +"', alamat='" +
                            text5.getText().toString() + "' where no='" +
                            text1.getText().toString()+"'");
                    Toast.makeText(getApplicationContext(), "Perubahan Tersimpan...",
                            Toast.LENGTH_LONG).show();
                    finish();
                }
                DataMahasiswa.da.RefreshList();
            }
        });
    }
}


