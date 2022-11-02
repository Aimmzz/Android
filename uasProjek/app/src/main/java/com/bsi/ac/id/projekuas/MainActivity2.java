package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView2;
    AdapterRecyclerView2 recyclerViewAdapter2;
    RecyclerView.LayoutManager recyclerViewLayoutManager2;
    ArrayList<ItemModel2> data2;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerView2.setHasFixedSize(true);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerViewLayoutManager2 = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(recyclerViewLayoutManager2);
        recyclerView2.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        data2 = new ArrayList<>();
        int length2 = MyItem2.headLine2.length;
        for (int i = 0;i < length2; i++){
            data2.add(new ItemModel2(
                    MyItem2.headLine2[i],
                    MyItem2.subHeadLine2[i],
                    MyItem2.imageList2[i]
            ));
        }
        recyclerViewAdapter2 = new AdapterRecyclerView2(this,data2);
        recyclerView2.setAdapter(recyclerViewAdapter2);
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