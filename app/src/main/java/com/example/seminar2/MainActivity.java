package com.example.seminar2;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Seminar", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Seminar", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Seminar", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Seminar", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Seminar", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Seminar", "onDestroy");
    }
}