package com.example.popupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        new Handler().postDelayed(() -> {
            Intent i = new Intent(MainActivity.this, PopupPage.class);
            startActivity(i);
        },3000);
    }
}