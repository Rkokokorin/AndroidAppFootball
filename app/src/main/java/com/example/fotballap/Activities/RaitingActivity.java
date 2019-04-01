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
        Player player = new Player("АлександрКержаков",4,4,5,0,5,"Нападающий");
        Player player2 = new Player("АлександрКокорин",8,4,0,0,0,"Защитник");
        Player player3 = new Player("Александр Петров",4,4,5,0,2,"Полузащитник");
        Player player4 = new Player("Антоn Кержаков",4,4,5,1,0,"Нападающий");
        Player player5 = new Player("Роман Kокорин",20,4,5,0,1,"Нападающий");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiting);
        recyclerViewrating = findViewById(R.id.recycleViewRaiting);
        LinearLayoutManager layoutManagerRaiting = new LinearLayoutManager(this);
        recyclerViewrating.setLayoutManager(layoutManagerRaiting);
        raitingAdapter = new RaitingAdapter(Persons.Players.size());
        recyclerViewrating.setAdapter(raitingAdapter);
//      recyclerViewrating.setHasFixedSize(true);





    }

    public void BackClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);

    }
}
