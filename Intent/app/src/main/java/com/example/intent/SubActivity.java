package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_received;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        tv_received = findViewById(R.id.tv_received);
        Intent intent = getIntent();                           // Create and get intent from previous activity
        String str = intent.getStringExtra("str");      // Input 'str' which belongs previous activity into new 'str' from intent
        tv_received.setText(str);                              // Set text to str that received
    }
}