package com.example.santikush.moonjackmusicapplication.database.entitées;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

@Entity
public class Track implements Parcelable{

    @PrimaryKey(autoGenerate = true)
    private int id_track;

    private String artiste;
    private String album;
    private String titre;
    private double duree;

    public Track() {
    }

    public Track(int id_track, String artiste, String album, String titre, double duree) {
        this.id_track = id_track;
        this.artiste = artiste;
        this.album = album;
        this.titre = titre;
        this.duree = duree;
    }

    protected Track(Parcel in) {
        id_track = in.readInt();
        artiste = in.readString();
        album = in.readString();
        titre = in.readString();
        duree = in.readDouble();
    }

    public static final Creator<Track> CREATOR = new Creator<Track>() {
        @Override
        public Track createFromParcel(Parcel in) {
            return new Track(in);
        }

        @Override
        public Track[] newArray(int size) {
            return new Track[size];
        }
    };

    public void setId_track(int id_track) {
        this.id_track = id_track;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public int getId_track() {
        return id_track;
    }

    public String getArtiste() {
        return artiste;
    }

    public String getAlbum() {
        return album;
    }

    public String getTitre() {
        return titre;
    }

    public double getDuree() {
        return duree;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id_track);
        dest.writeString(artiste);
        dest.writeString(album);
        dest.writeString(titre);
        dest.writeDouble(duree);
    }
}
