package com.example.kevan.buildingblock.android_component.service.started_service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.kevan.buildingblock.R;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }

    //button click events
    public void startService(View view) {
        Intent intent = new Intent(getApplicationContext(),MyService.class);
        startService(intent);
    }

    //button click events
    public void stopService(View view) {
        Intent intent = new Intent(getBaseContext(),MyService.class);
        stopService(intent);
    }
}
