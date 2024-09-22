package MusicPlayer;

import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private List<Album> favoriteAlbums;

    public User(String name) {
        this.name = name;
        this.favoriteAlbums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFavoriteAlbum(Album album) {
        favoriteAlbums.add(album);
    }

    public List<Album> getFavoriteAlbums() {
        return favoriteAlbums;
    }

    public void browseAlbum(Album album) {
        System.out.println("Browsing album: " + album.getTitle());
        for (Song song : album.getSongs()) {
            System.out.println(song);
        }
    }
}

