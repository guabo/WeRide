package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ratePassenger extends AppCompatActivity {

    Button homeButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_passenger);

        homeButton = findViewById(R.id.homeButtonPassenger);
        homeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent = new Intent(ratePassenger.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}