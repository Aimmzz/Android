package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    RecyclerView recyclerView4;
    AdapterRecyclerView4 recyclerViewAdapter4;
    RecyclerView.LayoutManager recyclerViewLayoutManager4;
    ArrayList<ItemModel4> data4;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        recyclerView4 = findViewById(R.id.recyclerView4);
        recyclerView4.setHasFixedSize(true);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerViewLayoutManager4 = new LinearLayoutManager(this);
        recyclerView4.setLayoutManager(recyclerViewLayoutManager4);
        recyclerView4.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        data4 = new ArrayList<>();
        int length4 = MyItem4.headLine4.length;
        for (int i = 0; i < length4; i++){
            data4.add(new ItemModel4(
                    MyItem4.headLine4[i],
                    MyItem4.subHeadLine4[i],
                    MyItem4.imageList4[i]
            ));
        }
        recyclerViewAdapter4 = new AdapterRecyclerView4(this, data4);
        recyclerView4.setAdapter(recyclerViewAdapter4);

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