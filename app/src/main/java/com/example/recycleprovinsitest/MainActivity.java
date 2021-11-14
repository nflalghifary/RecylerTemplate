package com.example.recycleprovinsitest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] provinsi = getResources().getStringArray(R.array.Provinsi);
        items = new ArrayList<>();
        for(int i = 0; i < provinsi.length; i++){
            items.add(String.valueOf(provinsi[i]));
        }

        recyclerView = findViewById(R.id.dataProvinsi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, items);
        recyclerView.setAdapter(adapter);
    }
}