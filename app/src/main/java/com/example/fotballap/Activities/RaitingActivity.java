package com.example.fotballap.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;

import com.example.fotballap.Logic.domain.persons.Persons;
import com.example.fotballap.Logic.domain.persons.Player;
import com.example.fotballap.R;

import Adapters.RaitingAdapter;

public class RaitingActivity extends AppCompatActivity {
    RecyclerView recyclerViewrating;
    private RaitingAdapter raitingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Persons.createPlayers();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiting);
        recyclerViewrating = findViewById(R.id.recycleViewRaiting);
        LinearLayoutManager layoutManagerRaiting = new LinearLayoutManager(this);
        recyclerViewrating.setLayoutManager(layoutManagerRaiting);
        raitingAdapter = new RaitingAdapter(Persons.Players.size());
        recyclerViewrating.setAdapter(raitingAdapter);
      recyclerViewrating.setHasFixedSize(true);





    }

    public void BackClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);

    }
}
