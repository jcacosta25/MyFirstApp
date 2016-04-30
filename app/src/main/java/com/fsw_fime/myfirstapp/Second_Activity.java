package com.fsw_fime.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Second_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    WeatherAdapter weatherAdapter;
    List<Clima> climaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        weatherAdapter = new WeatherAdapter(climaList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(weatherAdapter);

        Clima clima = new Clima("30","Monterrey");
        climaList.add(clima);
        clima = new Clima("38","El Cairo");
        climaList.add(clima);
        weatherAdapter.notifyDataSetChanged();
    }
}
