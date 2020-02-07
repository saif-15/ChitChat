package com.stechlabs.chitchat;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {

    public static final String CHANNEL_ID="chitchat_channel_1";
    @Override
    public void onCreate() {
        super.onCreate();
        createChannel();

    }
    private void createChannel(){
         if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){

             NotificationChannel notificationChannel=new NotificationChannel(CHANNEL_ID
                     ,"ChitChat", NotificationManager.IMPORTANCE_HIGH);

             NotificationManager notificationManager=getSystemService(NotificationManager.class);
             notificationManager.createNotificationChannel(notificationChannel);

         }
    }
}
