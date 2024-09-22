package MusicPlayer;

public class MusicPlayer {
    public static void main(String[] args) {
        // Creating Singers
        Singer singer1 = new Singer("Amrinder Gill");
        Singer singer2 = new Singer("Sidhu MooseWala");

        // Creating Songs
        Song song1 = new Song("Raah", "4:55", singer1);
        Song song2 = new Song("So High", "3:53", singer2);

        // Creating Albums
        Album album1 = new Album("25");
        album1.addSong(song1);

        Album album2 = new Album("MooseTape");
        album2.addSong(song2);

        // Creating a User
        User user = new User("Yash Mehra");

        // Browsing Albums
        user.browseAlbum(album1);
        user.browseAlbum(album2);

        // Adding Favorite Album
        user.addFavoriteAlbum(album1);

        // Displaying Favorite Albums
        System.out.println("Favorite Albums of " + user.getName() + ":");
        for (Album album : user.getFavoriteAlbums()) {
            System.out.println(album);
        }
    }
}

