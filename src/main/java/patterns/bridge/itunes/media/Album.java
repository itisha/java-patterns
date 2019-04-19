package patterns.bridge.itunes.media;

import java.util.List;

public class Album {

    private String title;
    private String coverImnageURL;
    private Artist artist;
    private List<Track> trackList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverImnageURL() {
        return coverImnageURL;
    }

    public void setCoverImnageURL(String coverImnageURL) {
        this.coverImnageURL = coverImnageURL;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }
}
