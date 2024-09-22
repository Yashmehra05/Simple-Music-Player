package MusicPlayer;

class Singer {
    private String name;

    public Singer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Singer: " + name;
    }
}

