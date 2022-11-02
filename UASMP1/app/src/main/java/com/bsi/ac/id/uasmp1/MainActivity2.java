package com.bsi.ac.id.uasmp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView2;
    AdapterRecycler2 adapterRecycler2;
    RecyclerView.LayoutManager layoutManager2;
    ArrayList<ItemModel2> data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView2 = findViewById(R.id.recycler_view2);
        recyclerView2.setHasFixedSize(true);

        layoutManager2 = new GridLayoutManager(this,2);
        recyclerView2.setLayoutManager(layoutManager2);

        data2 = new ArrayList<>();
        for (int i = 0;i < MyItem2.namaJajanan2.length; i++){
            data2.add(new ItemModel2(
                    MyItem2.namaJajanan2[i],
                    MyItem2.negara2[i],
                    MyItem2.foto2[i]
            ));
        }

        adapterRecycler2 = new AdapterRecycler2(this,data2);
        recyclerView2.setAdapter(adapterRecycler2);
    }
}