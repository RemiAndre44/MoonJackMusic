package com.example.santikush.moonjackmusicapplication.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.santikush.moonjackmusicapplication.database.entitées.Commentaire;

import org.w3c.dom.Comment;

import java.util.List;

@Dao
public interface CommentDAO extends GenericDAO<Commentaire>{

    @Query("SELECT * FROM Commentaire")
    List<Commentaire> getAll();

    @Query("DELETE FROM Commentaire")
    void deleteAll();
}
