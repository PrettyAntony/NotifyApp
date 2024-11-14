package com.example.teamnotifyapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.teamnotifyapp.databinding.ActivityNotificationDetailsBinding;

public class NotificationDetailsActivity extends AppCompatActivity {

    ActivityNotificationDetailsBinding detailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inflate layout by view binding
        detailsBinding = ActivityNotificationDetailsBinding.inflate(getLayoutInflater());
        setContentView(detailsBinding.getRoot());

        init();
    }

    private void init(){
        Log.i("info","In init");
        Intent notificationIntent = getIntent();
        String attendees = notificationIntent.getStringExtra("ATTENDEES");
        String location = notificationIntent.getStringExtra("LOCATION");

        Log.i("Attendees",attendees);
        detailsBinding.txtAttendees.setText(attendees);
        detailsBinding.txtLocation.setText(location);
    }
}