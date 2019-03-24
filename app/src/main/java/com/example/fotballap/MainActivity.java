package com.example.fotballap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button LoginButton = (Button)findViewById(R.id.LoginButtonId);

        View.OnClickListener LoginButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        LoginButton.setOnClickListener(LoginButtonListener);
    }
}
