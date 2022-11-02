package com.bsi.ac.id.uasmp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Default2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default2);

        ImageView imageDefault2 = findViewById(R.id.image_default2);
        TextView namaDefault2 = findViewById(R.id.nama_default2);
        TextView teks = findViewById(R.id.deskripsi2);

        Intent intent = getIntent();

        int fotoJajanan2 = intent.getIntExtra("GAMBAR_DEFAULT2",0);
        String namaJajanan2 = intent.getStringExtra("TEXT_DEFAULT2");
        String deskripsi2 = intent.getStringExtra("DESC_DEFAULT2");

        imageDefault2.setImageResource(fotoJajanan2);
        namaDefault2.setText(namaJajanan2);
        teks.setText(deskripsi2);
    }
}