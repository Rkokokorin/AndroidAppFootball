package com.example.fotballap.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.example.fotballap.Logic.domain.teams.Teams;
import com.example.fotballap.R;


import Adapters.TournamentTableAdapter;

public class TournamentTableActivity extends AppCompatActivity {
    RecyclerView recyclerViewTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_activity);
        recyclerViewTable = findViewById(R.id.TournamenTableView);
        LinearLayoutManager layoutManagerTable = new LinearLayoutManager(this);
        recyclerViewTable.setLayoutManager(layoutManagerTable);
        TournamentTableAdapter tableAdapter = new TournamentTableAdapter(Teams.sortedTeams.size());
        recyclerViewTable.setAdapter(tableAdapter);


    }

    public void BackClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);

    }
}
