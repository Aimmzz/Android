package com.bsi.ac.id.uasmp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRecycler adapterRecycler;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();
        for (int i = 0;i < MyItem.namaJajanan.length; i++){
            data.add(new ItemModel(
                    MyItem.namaJajanan[i],
                    MyItem.negara[i],
                    MyItem.foto[i]
            ));
        }

        adapterRecycler = new AdapterRecycler(this,data);
        recyclerView.setAdapter(adapterRecycler);
    }
}