package com.example.kevan.buildingblock.android_component.broadcast_receiver.ordered_broadcast_receiver;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.kevan.buildingblock.R;

public class OrderedBroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordered_broadcast);
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                broadcastintent();
            }
        });
    }

    public void broadcastintent() {
        Intent intent = new Intent();
        intent.setAction("com.example.ordered_broadcast.OrderedBroadcast");
        sendOrderedBroadcast(intent, null, new BroadcastReceiver() {
            @SuppressLint("NewApi")
            @Override
            public void onReceive(Context context, Intent intent) {
                              /*
                               * to capture result after all broadreceivers are finished
                               * executing
                               */
            }
        }, null, Activity.RESULT_OK, null, null);

    }
}
