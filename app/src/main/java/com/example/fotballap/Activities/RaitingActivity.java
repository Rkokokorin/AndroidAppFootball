package com.example.fotballap.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fotballap.Logic.domain.persons.Player;
import com.example.fotballap.R;

public class RaitingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiting);
        Player player = new Player("Александр","Кержаков",4,4,5,0,5,"Нападающий");
        Player player2 = new Player("Александр","Кокорин",8,4,0,0,0,"Защитник");
        Player player3 = new Player("Александр","Петров",4,4,5,0,2,"Полузащитник");
        Player player4 = new Player("Антон","Кержаков",4,4,5,1,0,"Нападающий");
        Player player5 = new Player("Роман","Кокорин",20,4,5,0,1,"Нападающий");

    }

    public void BackClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);

    }
}
