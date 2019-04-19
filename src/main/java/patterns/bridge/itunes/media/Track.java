package patterns.bridge.itunes.media;

public class Track {

    private String title;
    private Artist artist;
    private Album album;
    private String audiofileUrl;

    public Track(String title, Artist artist, Album album, String audiofileUrl) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.audiofileUrl = audiofileUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getAudiofileUrl() {
        return audiofileUrl;
    }

    public void setAudiofileUrl(String audiofileUrl) {
        this.audiofileUrl = audiofileUrl;
    }
}
