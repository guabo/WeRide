package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rateDriver extends AppCompatActivity {

    Button homeButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_driver);

        homeButton = findViewById(R.id.homeButtonDriver);
        homeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent = new Intent(rateDriver.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}