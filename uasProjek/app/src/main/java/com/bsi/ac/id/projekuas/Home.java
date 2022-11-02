package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    }

    public void move(View view) {
        Intent intent = new Intent(Home.this,MainActivity.class);
        startActivity(intent);
    }

    public void move2(View view) {
        Intent intent = new Intent(Home.this,MainActivity2.class);
        startActivity(intent);
    }

    public void move3(View view) {
        Intent intent = new Intent(Home.this,MainActivity3.class);
        startActivity(intent);
    }

    public void move4(View view) {
        Intent intent = new Intent(Home.this,MainActivity4.class);
        startActivity(intent);
    }

    public void move5(View view) {
        Intent intent = new Intent(Home.this,AboutActivity.class);
        startActivity(intent);
    }
}