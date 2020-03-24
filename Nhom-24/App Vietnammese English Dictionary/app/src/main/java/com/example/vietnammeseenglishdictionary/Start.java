package com.example.vietnammeseenglishdictionary;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;



public class Start extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        new Handler().postDelayed(new  Runnable(){
            @Override
            public void run() {
                Intent intent= new Intent(Start.this , MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
