package com.example.kevan.buildingblock;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.kevan.buildingblock.classes.BindService;

import java.util.Date;

public class BindServiceActivity extends AppCompatActivity {

    BindService localService;
    private boolean isBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind_service);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(this, BindService.class);
        bindService(intent, connection, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (isBound) {
            unbindService(connection);
            isBound = false;
        }
    }

    public void dispalyDate(View v) {
        if (isBound) {
            Date date = localService.getCurrentDate();
            Toast.makeText(this, String.valueOf(date), Toast.LENGTH_SHORT).show();
        }
    }

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName className, IBinder service) {
            BindService.LocalBinder binder = (BindService.LocalBinder) service;
            localService = binder.getService();
            isBound = true;
        }
        @Override
        public void onServiceDisconnected(ComponentName arg0) {
            isBound = false;
        }
    };
}
