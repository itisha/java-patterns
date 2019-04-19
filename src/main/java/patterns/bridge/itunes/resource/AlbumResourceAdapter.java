package patterns.bridge.itunes.resource;

import patterns.bridge.itunes.media.Album;
import patterns.bridge.itunes.media.Track;

import java.util.stream.Collectors;

public class AlbumResourceAdapter implements Resource {

    private Album album;

    public AlbumResourceAdapter(Album album) {
        this.album = album;
    }

    @Override
    public String getTitle() {
        return album.getTitle();
    }

    @Override
    public String getShortDescription() {
        return album.getTitle() + " by " + album.getArtist().getName();
    }

    @Override
    public String getLongDescription() {
        return album.getTrackList().stream().map(Track::getTitle).collect(Collectors.joining(" / "));
    }

    @Override
    public String getImageURL() {
        return album.getCoverImnageURL();
    }
}
