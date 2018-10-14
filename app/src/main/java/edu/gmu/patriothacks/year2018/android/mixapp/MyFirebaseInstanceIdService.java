package edu.gmu.patriothacks.year2018.android.mixapp;

//import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        //now we will have the token
        String token = FirebaseInstanceId.getInstance().getToken();

        //token written to the log, so you can access it, removed for final app
        //Log.d("MyRefreshedToken", token);
    }
}
