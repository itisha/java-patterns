package patterns.bridge.adapter;

import patterns.bridge.media.Track;
import patterns.bridge.resource.Resource;

public class TrackResourceAdapter implements Resource {

    private Track track;

    public TrackResourceAdapter(Track track) {
        this.track = track;
    }

    @Override
    public String getTitle() {
        return track.getTitle();
    }

    @Override
    public String getShortDescription() {
        return track.getAlbum().getTitle();
    }

    @Override
    public String getLongDescription() {
        return track.getArtist().getName() +
                track.getAlbum().getTitle();
    }

    @Override
    public String getImageURL() {
        return track.getAlbum().getTitle();
    }
}
