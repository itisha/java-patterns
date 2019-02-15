package patterns.bridge.adapter;

import patterns.bridge.media.Album;
import patterns.bridge.media.Track;
import patterns.bridge.resource.Resource;

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
        return album.getTitle() + album.getArtist();
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
