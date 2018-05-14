package com.example.santikush.moonjackmusicapplication.database.entitées;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.os.Parcel;
import android.os.Parcelable;

import com.example.santikush.moonjackmusicapplication.database.DateTypeConverter;

import java.util.Date;

@Entity
public class Commentaire implements Parcelable{

    @PrimaryKey(autoGenerate = true)
    private int id_commentaire;

    private String contenu;
    private int id_user;
    @TypeConverters({DateTypeConverter.class})
    private Date dateCommentaire;

    public Commentaire(int id_commentaire, String contenu, int id_user, Date dateCommentaire) {
        this.id_commentaire = id_commentaire;
        this.contenu = contenu;
        this.id_user = id_user;
        this.dateCommentaire = dateCommentaire;
    }

    public Commentaire() {
    }

    protected Commentaire(Parcel in) {
        id_commentaire = in.readInt();
        contenu = in.readString();
        id_user = in.readInt();
    }

    public static final Creator<Commentaire> CREATOR = new Creator<Commentaire>() {
        @Override
        public Commentaire createFromParcel(Parcel in) {
            return new Commentaire(in);
        }

        @Override
        public Commentaire[] newArray(int size) {
            return new Commentaire[size];
        }
    };

    public int getId_commentaire() {
        return id_commentaire;
    }

    public String getContenu() {
        return contenu;
    }

    public int getId_user() {
        return id_user;
    }

    public Date getDateCommentaire() {
        return dateCommentaire;
    }

    public void setId_commentaire(int id_commentaire) {
        this.id_commentaire = id_commentaire;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setDateCommentaire(Date dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id_commentaire);
        dest.writeString(contenu);
        dest.writeInt(id_user);
    }
}
