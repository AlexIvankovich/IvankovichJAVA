package com.homework.hwPlaylist;

    public class Track implements AudioTrack {
        private String title;
        private String artist;
        private String genre;
        private int duration;
        private double rating;

        public Track(String title, String artist, String genre, int duration) {
            this.title = title;
            this.artist = artist;
            this.genre = genre;
            this.duration = duration;
            this.rating = 0.0;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getArtist() {
            return artist;
        }

        @Override
        public String getGenre() {
            return genre;
        }

        @Override
        public int getDuration() {
            return duration;
        }

        @Override
        public double getRating() {
            return rating;
        }

        @Override
        public void setRating(double rating) {
            this.rating = rating;
        }

        @Override
        public String toString() {
            return String.format("Трек: %s, Исполнитель: %s, Жанр: %s, Длительность: %d секунд, Рейтинг: %.1f",
                    title, artist, genre, duration, rating);
        }
    }
