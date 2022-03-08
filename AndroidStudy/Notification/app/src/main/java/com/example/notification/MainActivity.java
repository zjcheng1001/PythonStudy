package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendNotice = (Button) findViewById(R.id.send_notice);
        sendNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.send_notice:
                        Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
                        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);

                        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                        //创建NotificationChannel
                        String channelId = "default";
                        String channelName = "默认通知";
                        manager.createNotificationChannel(new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH));

                        Notification notification = new NotificationCompat.Builder(MainActivity.this, channelId)
                                .setContentTitle("title")
                                .setContentText("This is a content text")
                                .setWhen(System.currentTimeMillis())
                                .setSmallIcon(R.mipmap.ic_launcher)
                                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                                .setContentIntent(pendingIntent)
                                .setAutoCancel(true)
                                .build();
                        manager.notify(1, notification);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}