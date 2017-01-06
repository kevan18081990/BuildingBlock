package com.example.kevan.buildingblock.android_component.broadcast_receiver.simple_broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Kevan on 1/6/2017.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Broadcasted Intent Detected.", Toast.LENGTH_LONG).show();
    }
}
