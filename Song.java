package MusicPlayer;

class Song {
    private String title;
    private String duration;
    private Singer singer;

    public Song(String title, String duration, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public Singer getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return "Song: " + title + " (" + duration + ") by " + singer.getName();
    }
}

