package com.example.santikush.moonjackmusicapplication.activitées;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.santikush.moonjackmusicapplication.R;

public class HomeActivity extends ActivityMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public void onTrackClic(View view) {
        Intent intent = new Intent(HomeActivity.this,TrackListeActivity.class);
        startActivity(intent);

    }
}
