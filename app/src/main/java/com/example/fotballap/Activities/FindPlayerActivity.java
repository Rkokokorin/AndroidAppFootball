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

import com.example.fotballap.Logic.domain.persons.Person;
import com.example.fotballap.Logic.domain.persons.Persons;
import com.example.fotballap.R;

public class FindPlayerActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_player);

    }
    public void BackClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);

    }

    public void FindPlayer(View view) {
       if (Persons.PlayerNameMap.containsKey(((EditText)findViewById(R.id.nameId)).getText().toString()))
       {Toast.makeText(this,"Игрок найден", Toast.LENGTH_SHORT).show();}
       else Toast.makeText(this,"Такого игрока нет!", Toast.LENGTH_SHORT).show();


    }
}
