package com.example.kevan.buildingblock.android_component.broadcast_receiver.ordered_broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Kevan on 1/6/2017.
 */

public class MyReceiver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "MyReceiver1 provoked", Toast.LENGTH_LONG).show();
    }
}
