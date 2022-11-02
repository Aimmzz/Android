package com.bsi.ac.id.uasmp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Default extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);

        ImageView imageDefault = findViewById(R.id.image_default);
        TextView namaDefault = findViewById(R.id.nama_default);
        TextView teks = findViewById(R.id.deskripsi);

        Intent intent = getIntent();

        int fotoJajanan = intent.getIntExtra("GAMBAR_DEFAULT", 0);
        String namaJajanan = intent.getStringExtra("TEKS_DEFAULT");
        String deskripsi = intent.getStringExtra("DESC_DEFAULT");

        imageDefault.setImageResource(fotoJajanan);
        namaDefault.setText(namaJajanan);
        teks.setText(deskripsi);
    }
}