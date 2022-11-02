package id.ac.rohim.sekolahku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ActionMode;

public class splashscreen extends AppCompatActivity {
    private int waktu_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(splashscreen.this,
                        MainActivity.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);

    }
}