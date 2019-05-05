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

public class AboutActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

    }

}
