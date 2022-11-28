package com.example.carpoolingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateAccount extends AppCompatActivity {
    Intent intent1;
    Intent intent2;
    Button signup;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        signup = findViewById(R.id.button9);
        back = findViewById(R.id.button7);

        signup.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent1 = new Intent(CreateAccount.this, Booking.class);
                startActivity(intent1);
            }
        });
        back.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                intent2 = new Intent(CreateAccount.this, MainActivity.class);
                startActivity(intent2);
            }
        });

    }
}