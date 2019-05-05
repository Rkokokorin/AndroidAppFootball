package com.example.fotballap.Activities;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fotballap.Logic.domain.persons.Persons;
import com.example.fotballap.Logic.domain.teams.Teams;
import com.example.fotballap.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Persons.createPlayers();
        Teams.createTeams();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    String login = "login";
    String password = "password";
    public void onClickLogin(View view) {
        if (login.equals(((EditText)findViewById(R.id.LoginId)).getText().toString())&&(password.equals(((EditText)findViewById(R.id.PasswordId)).getText().toString()))) {
            Toast.makeText(this, "Добро Пожаловать", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        }
        else Toast.makeText(this,"Ошибка аутинтификации", Toast.LENGTH_SHORT).show();

    }
}
