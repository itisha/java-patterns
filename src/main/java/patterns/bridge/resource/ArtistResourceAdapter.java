package patterns.bridge.resource;

import patterns.bridge.media.Artist;

public class ArtistResourceAdapter implements Resource {

    private Artist artist;

    public ArtistResourceAdapter(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return artist.getName();
    }

    @Override
    public String getShortDescription() {
        return artist.getGenre();
    }

    @Override
    public String getLongDescription() {
        return artist.getBiography();
    }

    @Override
    public String getImageURL() {
        return artist.getImageUrl();
    }
}
