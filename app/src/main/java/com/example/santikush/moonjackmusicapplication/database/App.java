package com.example.santikush.moonjackmusicapplication.database;

import android.app.Application;
import android.arch.persistence.room.Room;

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
        new Seed().execute();

        instance = this;
    }
}
