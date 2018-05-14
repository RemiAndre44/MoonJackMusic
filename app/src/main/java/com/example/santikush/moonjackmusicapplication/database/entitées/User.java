package com.example.santikush.moonjackmusicapplication.database.entitées;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

@Entity
public class User implements Parcelable{

    @PrimaryKey(autoGenerate = true)
    private int id_user;

    private String pseudo;

    public User(int id_user, String pseudo) {
        this.id_user = id_user;
        this.pseudo = pseudo;
    }

    public User() {
    }

    protected User(Parcel in) {
        id_user = in.readInt();
        pseudo = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public int getId_user() {
        return id_user;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id_user);
        dest.writeString(pseudo);
    }
}
