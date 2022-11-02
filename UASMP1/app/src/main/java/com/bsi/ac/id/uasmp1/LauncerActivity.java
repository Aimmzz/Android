package com.bsi.ac.id.uasmp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LauncerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcer);
    }


    public void pindah1(View view) {
        Intent intent = new Intent(LauncerActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void pindah2(View view) {
        Intent intent = new Intent(LauncerActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}