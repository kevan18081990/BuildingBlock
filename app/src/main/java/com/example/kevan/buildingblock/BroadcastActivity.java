package com.example.kevan.buildingblock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }

    //Button click event
    public void broadcastIntent(View view) {
        Intent intent = new Intent();
        intent.setAction("com.example.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
