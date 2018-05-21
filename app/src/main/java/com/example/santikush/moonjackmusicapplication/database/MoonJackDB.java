package com.example.santikush.moonjackmusicapplication.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.example.santikush.moonjackmusicapplication.database.dao.CommentDAO;
import com.example.santikush.moonjackmusicapplication.database.dao.TrackDAO;
import com.example.santikush.moonjackmusicapplication.database.dao.UserDAO;
import com.example.santikush.moonjackmusicapplication.database.entitées.Commentaire;
import com.example.santikush.moonjackmusicapplication.database.entitées.Track;
import com.example.santikush.moonjackmusicapplication.database.entitées.User;

@Database(entities = {Track.class, Commentaire.class, User.class}, version = 4)
@TypeConverters({DateTypeConverter.class})
public abstract class MoonJackDB extends RoomDatabase {

    public static final String DATABASE_NAME = "MoonJack";

    public abstract TrackDAO trackDAO();
    public abstract UserDAO userDAO();
    public abstract CommentDAO commentDAO();

}

