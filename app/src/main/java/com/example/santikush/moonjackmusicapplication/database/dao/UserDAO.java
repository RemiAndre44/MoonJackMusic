package com.example.santikush.moonjackmusicapplication.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.santikush.moonjackmusicapplication.database.entitées.User;

import java.util.List;

@Dao
public interface UserDAO extends GenericDAO<User>{

    @Query("SELECT * FROM User")
    List<User> getAll();

    @Query("DELETE FROM User")
    void deleteAll();
}
