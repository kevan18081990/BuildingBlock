package com.example.kevan.buildingblock.classes;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Kevan on 1/5/2017.
 */

public class BindService extends Service {

    private final IBinder binder = new LocalBinder();
    public class LocalBinder extends Binder {
        public BindService getService() {
            return BindService.this;
        }
    }
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
    public Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }
}
