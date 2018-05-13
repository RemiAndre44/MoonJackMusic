package com.example.santikush.moonjackmusicapplication.activitées;

import android.os.Bundle;
import android.widget.ListView;

import com.example.santikush.moonjackmusicapplication.R;
import com.example.santikush.moonjackmusicapplication.activitées.ActivityMenu;
import com.example.santikush.moonjackmusicapplication.activitées.AdapterTrack;

public class TrackListeActivity extends ActivityMenu {

    private ListView lv;
    private AdapterTrack adapterTrack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_liste);


    }
}
