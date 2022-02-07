package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity","ONCREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity", "ONRESume");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity", "ONSTART");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity","ONpaused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity","ONstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity","ONDESTROY");
    }
}