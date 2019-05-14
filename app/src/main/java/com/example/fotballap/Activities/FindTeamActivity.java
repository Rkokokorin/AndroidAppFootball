package com.example.fotballap.Activities;


import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.example.fotballap.Logic.domain.persons.Persons;
import com.example.fotballap.Logic.domain.teams.Team;
import com.example.fotballap.Logic.domain.teams.Teams;
import com.example.fotballap.R;

public class FindTeamActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_team);

    }
    public void BackClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);

    }
    static  public  String name;
    public void FindPlayer(View view) {
        if (Teams.TeamMap.containsKey((( EditText)findViewById(R.id.nameId)).getText().toString()))
                        { name=((EditText)findViewById(R.id.nameId)).getText().toString();

            Intent intent = new Intent(getApplicationContext(), TeamActivity.class);

            startActivity(intent);
        }
        else Toast.makeText(this,"Такой команды нет!", Toast.LENGTH_SHORT).show();


    }
}
