package com.homework.hwPlaylist;

public interface AudioTrack {

    String getTitle();

    String getArtist();

    String getGenre();

    int getDuration();

    double getRating();

    void setRating(double rating);

}
