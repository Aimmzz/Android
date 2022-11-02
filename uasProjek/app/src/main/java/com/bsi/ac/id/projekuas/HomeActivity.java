package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void move1(View view) {
        Intent intent = new Intent(HomeActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void move2(View view) {
        Intent intent = new Intent(HomeActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    public void move3(View view) {
        Intent intent = new Intent(HomeActivity.this,MainActivity3.class);
        startActivity(intent);
    }

    public void move4(View view) {
        Intent intent = new Intent(HomeActivity.this, MainActivity4.class);
        startActivity(intent);
    }
}