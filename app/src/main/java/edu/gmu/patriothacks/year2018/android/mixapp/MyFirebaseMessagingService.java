package edu.gmu.patriothacks.year2018.android.mixapp;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        // later send data with the messages to interact with the student/other employees
        if(remoteMessage.getData().size() > 0){
            //handle the data message here
        }

        //getting the title and the body
        String title = (remoteMessage.getNotification().getTitle() == null) ? "Mix App" : remoteMessage.getNotification().getTitle();
        String body = remoteMessage.getNotification().getBody();

        //and create the notfication
        MyNotificationManager.getInstance(this).displayNotification(title, body);
    }
}