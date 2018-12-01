package com.example.tranvanha.serviceinrasonguyen;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class InrasonguyenService extends Service {
    private  int n=10;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        for(int i=1;i<n;i++){
//             i=i+1;
            Log.d("i la",i+"");
        }

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.d("i la","finish");
        super.onDestroy();
    }
}
