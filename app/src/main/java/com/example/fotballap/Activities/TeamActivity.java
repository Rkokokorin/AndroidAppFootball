package com.example.fotballap.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fotballap.Logic.domain.persons.Persons;
import com.example.fotballap.Logic.domain.persons.Player;
import com.example.fotballap.Logic.domain.teams.Team;
import com.example.fotballap.Logic.domain.teams.Teams;
import com.example.fotballap.R;


public class TeamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findteam_dialog);
       Team team = Teams.TeamMap.get(FindTeamActivity.name);
      TextView nametextview = findViewById(R.id.teamname);
        ImageView imageView = (ImageView)findViewById(R.id.logo);
//        Resources resources = this.getContext.getResources();
//        //paramText is name of your drawable
//        final int resourceId = resources.getIdentifier(paramText, "mipmap",
//                context.getPackageName());
//        ImageView imageview= (ImageView)findViewById(R.id.imageView);
//        imageview.setImageResource(resourceId);

//
        TextView teamplacetextview = findViewById(R.id.teamplace);
        TextView gamestextview = findViewById(R.id.teamgames);
        TextView drawstextview = findViewById(R.id.teamdraws);
        TextView losestextview = findViewById(R.id.teamloses);
        TextView captaintextview = findViewById(R.id.teamcaptain);
        TextView goaldiftextview = findViewById(R.id.teamgoaldiff);
        TextView winstextview = findViewById(R.id.teamwins);
        TextView tablepointsview = findViewById(R.id.teamtablepos);
//if (player!= null) {
   nametextview.setText(team.getName());
   teamplacetextview.setText(String.valueOf(Teams.sortedTeams.indexOf(team)+1));
   tablepointsview.setText(String.valueOf(team.getWins()*3+team.getDraws()));
   goaldiftextview.setText(String.valueOf(team.getGoals()-team.getInGoals()));
    captaintextview.setText((team.getCaptain()));
    drawstextview.setText(String.valueOf(team.getDraws()));
    losestextview.setText(String.valueOf(team.getLoses()));
    winstextview.setText(String.valueOf(team.getWins()));
    gamestextview.setText(String.valueOf(team.getGames()));
//}
    }
    public void BackClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);}


    }
