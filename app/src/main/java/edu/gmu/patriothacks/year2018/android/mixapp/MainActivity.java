package edu.gmu.patriothacks.year2018.android.mixapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinnerTopics);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationManager mNotificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel mChannel = new NotificationChannel(Constants.CHANNEL_ID, Constants.CHANNEL_NAME, importance);
            mChannel.setDescription(Constants.CHANNEL_DESCRIPTION);
            mChannel.enableLights(true);
            mChannel.setLightColor(Color.RED);
            mChannel.enableVibration(true);
            mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            mNotificationManager.createNotificationChannel(mChannel);
        }

        findViewById(R.id.buttonSubscribe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String topic = spinner.getSelectedItem().toString();
                FirebaseMessaging.getInstance().subscribeToTopic(topic);
                Toast.makeText(getApplicationContext(), topic + " Subscribed", Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.buttonUnsubscribe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String topic = spinner.getSelectedItem().toString();
                FirebaseMessaging.getInstance().unsubscribeFromTopic(topic);
                Toast.makeText(getApplicationContext(), topic + " Unsubscribed", Toast.LENGTH_LONG).show();
            }
        });
    }
}
