package com.test.helloservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class HelloIntentService extends IntentService {
    public HelloIntentService() {
        super("HelloIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("HelloIntentService", "休息5秒");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDestroy() {
        Log.d("HelloIntentService", "执行完onHandleIntent之后会自动调用");
        super.onDestroy();
    }
}
