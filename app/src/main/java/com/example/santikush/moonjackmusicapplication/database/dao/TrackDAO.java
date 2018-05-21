package com.example.santikush.moonjackmusicapplication.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.santikush.moonjackmusicapplication.database.entitées.Track;

import java.util.List;

@Dao
public interface TrackDAO extends GenericDAO<Track>{

    @Query("SELECT * FROM Track")
    List<Track> getAll();

    @Query("DELETE FROM Track")
    void deleteAll();
}
