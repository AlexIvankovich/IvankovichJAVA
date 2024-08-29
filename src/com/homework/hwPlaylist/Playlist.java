package com.homework.hwPlaylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Playlist {
    private List<AudioTrack> tracks;

    public Playlist() {
        tracks = new ArrayList<>();
    }

    public void addTrack(AudioTrack track) {
        tracks.add(track);
    }

    public void removeTrack(AudioTrack track) {
        tracks.remove(track);
    }

    public AudioTrack findTrackByTitle(String title) {
        for (AudioTrack track : tracks) {
            if (track.getTitle().equalsIgnoreCase(title)) {
                return track;
            }
        }
        return null;
    }

    public List<AudioTrack> findTracksByArtist(String artist) {
        List<AudioTrack> foundTracks = new ArrayList<>();
        for (AudioTrack track : tracks) {
            if (track.getArtist().equalsIgnoreCase(artist)) {
                foundTracks.add(track);
            }
        }
        return foundTracks;
    }

    public List<AudioTrack> getTracksSortedByRating() {
        tracks.sort(Comparator.comparingDouble(AudioTrack::getRating).reversed());
        return tracks;
    }

    public void displayTracks() {
        if (tracks.isEmpty()) {
            System.out.println("Плейлист пуст.");
        } else {
            for (AudioTrack track : tracks) {
                System.out.println(track);
            }
        }
    }
}