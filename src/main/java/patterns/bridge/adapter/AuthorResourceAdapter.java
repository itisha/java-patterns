package patterns.bridge.adapter;

import patterns.bridge.media.Author;
import patterns.bridge.resource.Resource;

public class AuthorResourceAdapter implements Resource {

    private Author author;

    public AuthorResourceAdapter(Author author) {
        this.author = author;
    }

    @Override
    public String getTitle() {
        return author.getName();
    }

    @Override
    public String getShortDescription() {
        return author.getBiography().substring(0, 128);
    }

    @Override
    public String getLongDescription() {
        return author.getBiography();
    }

    @Override
    public String getImageURL() {
        return author.getImageUrl();
    }
}
