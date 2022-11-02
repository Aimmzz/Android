package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DefaultActivity3 extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default3);

        TextView tvDefault3 = findViewById(R.id.tv_default3);
        TextView deskripsi3 = findViewById(R.id.deskripsi3);
        ImageView imDefault3 = findViewById(R.id.im_default3);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        int foto2 = intent.getIntExtra("GAMBAR_DEFAULT",0);
        String namaTokoh2 = intent.getStringExtra("NAMA_DEFAULT");
        String descTokoh2 = intent.getStringExtra("DESKRIPSI_TOKOH");

        tvDefault3.setText(namaTokoh2);
        deskripsi3.setText(descTokoh2);
        imDefault3.setImageResource(foto2);
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