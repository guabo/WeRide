package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AvailablePassengers extends AppCompatActivity {
    Intent intent1;
    Intent intent2;
    Button home;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_passengers);


        home = findViewById(R.id.button10);
        start = findViewById(R.id.button8);

        home.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent1 = new Intent(AvailablePassengers.this, Booking.class);
                startActivity(intent1);
            }
        });
        start.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent2 = new Intent(AvailablePassengers.this, bookingConfirmation.class);
                startActivity(intent2);
            }
        });

    }
}