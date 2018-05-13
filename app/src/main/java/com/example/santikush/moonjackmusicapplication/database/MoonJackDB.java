package com.example.santikush.moonjackmusicapplication.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.santikush.moonjackmusicapplication.database.dao.TrackDAO;
import com.example.santikush.moonjackmusicapplication.database.entitées.Track;

@Database(entities = {Track.class}, version = 4)
public abstract class MoonJackDB extends RoomDatabase {

    public static final String DATABASE_NAME = "MoonJack";

    public abstract TrackDAO trackDAO();


}

