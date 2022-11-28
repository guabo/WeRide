package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaceBookingView extends AppCompatActivity {

    Intent intent1;
    Intent intent2;
    Button home;
    Button bookNow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_booking_view);

        home = findViewById(R.id.button12);
        bookNow = findViewById(R.id.button11);

        home.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent1 = new Intent(PlaceBookingView.this, Booking.class);
                startActivity(intent1);
            }
        });
        bookNow.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent2 = new Intent(PlaceBookingView.this, YourBookings.class);
                startActivity(intent2);
            }
        });
    }
}