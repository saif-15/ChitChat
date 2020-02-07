package com.stechlabs.chitchat;
import android.app.NotificationManager;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FCMService extends FirebaseMessagingService {


    public static final String TAG="FCMService";
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        if(remoteMessage.getNotification()!=null){

            String title=remoteMessage.getNotification().getTitle();
            String body=remoteMessage.getNotification().getBody();
            NotificationCompat.Builder notification=new NotificationCompat.Builder(this,App.CHANNEL_ID)
                    .setContentTitle(title)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentText(body);
            NotificationManager notificationManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.notify(110,notification.build());
            Log.d(TAG,"on received msg called");
        }
    }

    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
    }

    @Override
    public void onDeletedMessages() {
        super.onDeletedMessages();
    }
}
