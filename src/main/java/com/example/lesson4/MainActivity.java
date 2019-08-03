package com.example.lesson4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter); // связываем recyclerView и adapter

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this); // создаем LayoutManager
        recyclerView.setLayoutManager(manager); // связываем recyclerView и LayoutManager
    }
}
