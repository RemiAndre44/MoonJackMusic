package com.example.santikush.moonjackmusicapplication.database;

import android.os.AsyncTask;
import android.util.Log;

import com.example.santikush.moonjackmusicapplication.App;
import com.example.santikush.moonjackmusicapplication.database.MoonJackDB;
import com.example.santikush.moonjackmusicapplication.database.entitées.User;

public class Seed  extends AsyncTask<Void, Void, String> {

    @Override
    protected String doInBackground(Void... voids) {
        MoonJackDB db = App.get().getDB();
        Log.d("test","start seed");

        db.commentDAO().deleteAll();
        db.trackDAO().deleteAll();
        db.userDAO().deleteAll();

        User remi=new User();
        remi.setPseudo("Miré");
        remi.setId_user( (int) db.userDAO().insert(remi));

        return null;
    }


}
