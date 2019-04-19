package patterns.bridge.itunes.resource;

import patterns.bridge.itunes.media.Book;

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
