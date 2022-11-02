package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    RecyclerView recyclerView3;
    AdapterRecyclerView3 recyclerViewAdapter3;
    RecyclerView.LayoutManager recyclerViewLayoutManager3;
    ArrayList<ItemModel3> data3;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView3 = findViewById(R.id.recyclerView3);
        recyclerView3.setHasFixedSize(true);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerViewLayoutManager3 = new LinearLayoutManager(this);
        recyclerView3.setLayoutManager(recyclerViewLayoutManager3);
        recyclerView3.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        data3 = new ArrayList<>();
        int length3 = Myitem3.headLine3.length;
        for (int i = 0;i < length3; i++){
            data3.add(new ItemModel3(
                    Myitem3.headLine3[i],
                    Myitem3.subHeadLine3[i],
                    Myitem3.imageList3[i]
            ));
        }
        recyclerViewAdapter3 = new AdapterRecyclerView3(this,data3);
        recyclerView3.setAdapter(recyclerViewAdapter3);
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