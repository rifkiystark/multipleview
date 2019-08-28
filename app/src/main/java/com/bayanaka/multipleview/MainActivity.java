package com.bayanaka.multipleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<DataModel> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        arrayList.add(new DataModel(1));
        arrayList.add(new DataModel(1));
        arrayList.add(new DataModel(2));
        arrayList.add(new DataModel(1));
        arrayList.add(new DataModel(2));
        arrayList.add(new DataModel(1));

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new Adapter();
        adapter.setList(arrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}
