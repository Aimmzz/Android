package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DefaultActivity extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);

        TextView tvDefault = findViewById(R.id.tv_default);
        ImageView imDefault = findViewById(R.id.im_default);
        TextView deskripsi = findViewById(R.id.deskripsi);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        int fotoWali = intent.getIntExtra("GAMBAR_DEFAULT",0);
        String namaWali = intent.getStringExtra("TEKS_DEFAULT");
        String descWali = intent.getStringExtra("DESKRIPSI_TEXT");

        imDefault.setImageResource(fotoWali);
        tvDefault.setText(namaWali);
        deskripsi.setText(descWali);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}