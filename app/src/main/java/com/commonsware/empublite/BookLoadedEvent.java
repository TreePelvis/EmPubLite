package com.commonsware.empublite;

/**
 * Created by User on 7/4/2015.
 */
public class BookLoadedEvent {
    private BookContents contents = null;

    public BookLoadedEvent(BookContents contents) {
        this.contents = contents;
    }

    public BookContents getBook() {
        return (contents);
    }
}
