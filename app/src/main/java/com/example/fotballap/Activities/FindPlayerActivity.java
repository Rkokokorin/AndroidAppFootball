package com.example.fotballap.Activities;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

    public void FindPlayerButton(View view) {
    }
}