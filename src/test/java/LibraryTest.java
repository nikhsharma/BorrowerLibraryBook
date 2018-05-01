import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {
    Library testLibrary;
    Book book;
    Book book2;
    Book book3;

    @Before
    public void before() {
        testLibrary = new Library();
        book = new Book("A Book", "Thriller");
        book2 = new Book("Another Book", "Crime");
        book3 = new Book("One More Book", "Thriller");
    }

    @Test
    public void bookCountIsZero() {
        assertEquals(0, testLibrary.bookCount());
    }

    @Test
    public void canAddBookToCollection() {
        testLibrary.addBook(book);
        assertEquals(1, testLibrary.bookCount());
    }

    @Test
    public void cantAddBookWhenAtCapacity() {
        testLibrary.addBook(book);
        testLibrary.addBook(book);
        testLibrary.addBook(book);
        testLibrary.addBook(book);
        testLibrary.addBook(book);
        assertEquals(4, testLibrary.bookCount());
    }

    @Test
    public void canLendBook() {
        testLibrary.addBook(book);
        assertEquals(book, testLibrary.lendBook(0));
    }

    @Test
    public void countBooksByGenre() {
        testLibrary.addBook(book);
        testLibrary.addBook(book2);
        testLibrary.addBook(book3);
        assertEquals(2, testLibrary.bookCountByGenre("Thriller"));
        assertEquals(1, testLibrary.bookCountByGenre("Crime"));
    }

}
