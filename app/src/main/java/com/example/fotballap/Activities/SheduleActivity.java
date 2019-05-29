package com.example.fotballap.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.fotballap.Logic.domain.teams.Matches;
import com.example.fotballap.Logic.domain.teams.Teams;
import com.example.fotballap.R;

import Adapters.SheduleAdapter;
import Adapters.TournamentTableAdapter;

public class SheduleActivity extends AppCompatActivity {
    RecyclerView recyclerViewTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.shedule);
        recyclerViewTable = findViewById(R.id.recycleViewShedule);
        LinearLayoutManager layoutManagerTable = new LinearLayoutManager(this);
        recyclerViewTable.setLayoutManager(layoutManagerTable);
        SheduleAdapter sheduleAdapter = new SheduleAdapter( Matches.matches.size(),getApplicationContext());
        recyclerViewTable.setAdapter(sheduleAdapter);


    }

    public void BackClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);

    }
}
