package com.com.PlaylistChallenge;

import java.util.ArrayList;

public class Album {
    private String genre;
    private ArrayList<Song> songs;

    public Album(String genre) {
        this.genre = genre;
        this.songs = new ArrayList<Song>();
    }
    public Album() {
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String name,double duration){
       Song song=new Song(name,duration);
       this.songs.add(song);
        return true;
    }

    public String getGenre() {
        return genre;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
