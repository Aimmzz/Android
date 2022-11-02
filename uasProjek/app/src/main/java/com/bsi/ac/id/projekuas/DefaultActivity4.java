package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DefaultActivity4 extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default4);

        TextView tvDefault4 = findViewById(R.id.tv_default4);
        TextView deskripsi4 = findViewById(R.id.deskripsi4);
        ImageView imDefault4 = findViewById(R.id.im_default4);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        int foto3 = intent.getIntExtra("GAMBAR_DEFAULT",0);
        String namaTokoh3 = intent.getStringExtra("NAMA_DEFAULT");
        String descTokoh3 = intent.getStringExtra("DESKRIPSI_TOKOH");

        tvDefault4.setText(namaTokoh3);
        deskripsi4.setText(descTokoh3);
        imDefault4.setImageResource(foto3);
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