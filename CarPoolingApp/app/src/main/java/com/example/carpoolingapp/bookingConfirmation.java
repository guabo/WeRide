package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bookingConfirmation extends AppCompatActivity {

    Button homeButton;
    Button simulate;
    Intent intent;
    Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmation);

        homeButton = findViewById(R.id.homeButtonConfirmation);
        simulate = findViewById(R.id.button18);

        homeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent = new Intent(bookingConfirmation.this, Booking.class);
                startActivity(intent);
            }
        });

        simulate.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent2 = new Intent(bookingConfirmation.this, rateDriver.class);
                startActivity(intent2);
            }
        });
    }
}