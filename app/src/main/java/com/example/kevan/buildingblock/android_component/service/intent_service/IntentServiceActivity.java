package com.example.kevan.buildingblock.android_component.service.intent_service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kevan.buildingblock.R;

public class IntentServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_service);

        Intent intent = new Intent(this, HelloIntentService.class);
        startService(intent);
    }
}
