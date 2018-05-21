package com.example.santikush.moonjackmusicapplication;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.util.Log;

import com.example.santikush.moonjackmusicapplication.database.MoonJackDB;
import com.example.santikush.moonjackmusicapplication.database.Seed;

public class App extends Application {

    private static App instance;
    private MoonJackDB database;

    public static App get() {
        return instance;
    }

    public MoonJackDB getDB() {
        return database;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // Create db
        //
        // fallbackToDestructiveMigration and new Seed().execute()
        // need to be commented once in production :3
        database = Room
                .databaseBuilder(getApplicationContext(), MoonJackDB.class, MoonJackDB.DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build();
        Log.d("salut","salut");
        new Seed().execute();

        instance = this;
    }
}
