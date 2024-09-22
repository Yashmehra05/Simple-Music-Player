package MusicPlayer;

import java.util.ArrayList;
import java.util.List;

class Album {
    private String title;
    private List<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String getTitle() {
        return title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "Album: " + title + " with " + songs.size() + " songs.";
    }
}

