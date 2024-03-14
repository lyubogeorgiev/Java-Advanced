package L02Library;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book>{
    private final Book[] books;

    public Library(Book...books){
        this.books = books;
    }

    public Book[] getBooks(){
        return this.books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private class LibIterator implements Iterator<Book>{
        int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < getBooks().length;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }
}
