package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent intent1;
    Intent intent2;
    Button loginButton;
    Button create;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.button2);
        create = findViewById(R.id.button3);

        loginButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent1 = new Intent(MainActivity.this, Booking.class);
                startActivity(intent1);
            }
        });
        create.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent2 = new Intent(MainActivity.this, CreateAccount.class);
                startActivity(intent2);
            }
        });

    }


}