package com.homework.hwPlaylist;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Track track1 = new Track("Song 1", "Artist A", "Rock", 210);
        Track track2 = new Track("Song 2", "Artist B", "Pop", 180);
        Track track3 = new Track("Song 3", "Artist A", "Rock", 240);

        track1.setRating(4.5);
        track2.setRating(3.8);
        track3.setRating(5.0);

        playlist.addTrack(track1);
        playlist.addTrack(track2);
        playlist.addTrack(track3);

        System.out.println("Все треки в плейлисте:");
        playlist.displayTracks();

        AudioTrack foundTrack = playlist.findTrackByTitle("Song 2");
        if (foundTrack != null) {
            System.out.println("\nНайден трек: " + foundTrack);
        } else {
            System.out.println("\nТрек не найден.");
        }

        System.out.println("\nТреки, отсортированные по рейтингу:");
        for (AudioTrack track : playlist.getTracksSortedByRating()) {
            System.out.println(track);
        }
    }
}