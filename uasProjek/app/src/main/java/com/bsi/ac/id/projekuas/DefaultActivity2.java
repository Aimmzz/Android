package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DefaultActivity2 extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default2);

        TextView tvDefault2 = findViewById(R.id.tv_default2);
        TextView deskripsi2 = findViewById(R.id.deskripsi2);
        ImageView imDefault2 = findViewById(R.id.im_default2);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        int foto = intent.getIntExtra("GAMBAR_DEFAULT",0);
        String namaTokoh = intent.getStringExtra("NAMA_DEFAULT");
        String descTokoh = intent.getStringExtra("DESKRIPSI_TOKOH");

        tvDefault2.setText(namaTokoh);
        deskripsi2.setText(descTokoh);
        imDefault2.setImageResource(foto);
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