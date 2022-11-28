package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {

    Button homeButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        homeButton = findViewById(R.id.homeButtonSettings);
        homeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}