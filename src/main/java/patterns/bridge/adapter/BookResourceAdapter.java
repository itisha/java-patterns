package patterns.bridge.adapter;

import patterns.bridge.media.Book;
import patterns.bridge.resource.Resource;

public class BookResourceAdapter implements Resource {

    private Book book;

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public String getShortDescription() {
        return book.getTitle() + " by " + book.getAuthor();
    }

    @Override
    public String getLongDescription() {
        return book.getSummary();
    }

    @Override
    public String getImageURL() {
        return book.getCoverUrl();
    }
}
