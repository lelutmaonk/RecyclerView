package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private WisataAdapter wisataAdapter;
    private ArrayList<Wisata> wisataArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView    = findViewById(R.id.recyclerview);

        wisataAdapter   = new WisataAdapter(wisataArrayList);

        RecyclerView.LayoutManager layoutManager    = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(wisataAdapter);

    }

    public void getData(){

        wisataArrayList = new ArrayList<>();
        wisataArrayList.add(new Wisata("Garuda Wisnu Kencana","Ungasan","081XXXXXX"));
        wisataArrayList.add(new Wisata("Pantai Muaya","Jimbaran","081XXXXXX"));
        wisataArrayList.add(new Wisata("Water Boom","Kuta","081XXXXXX"));
    }
}