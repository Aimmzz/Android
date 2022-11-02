package com.bsi.ac.id.projekuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRecyclerView recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    ArrayList<ItemModel> data;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        data = new ArrayList<>();
        int length = MyItem.HeadLine.length;
        for (int i = 0; i < length; i++){
            data.add(new ItemModel(
                    MyItem.HeadLine[i],
                    MyItem.subHeadLine[i],
                    MyItem.imageList[i]));
        }

        recyclerViewAdapter = new  AdapterRecyclerView(this,data);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.item_search).getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                newText = newText.toLowerCase();
                ArrayList<ItemModel> itemFilter = new ArrayList<>();
                for (ItemModel model : data){
                    String nama = model.getName().toLowerCase();
                    if (nama.contains(newText)){
                        itemFilter.add(model);
                    }
                }
                recyclerViewAdapter.setFilter(itemFilter);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
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