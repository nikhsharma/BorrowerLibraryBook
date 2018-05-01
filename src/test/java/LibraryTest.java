import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {
    Library testLibrary;
    Book book;

    @Before
    public void before() {
        testLibrary = new Library();
        book = new Book();
    }

    @Test
    public void bookCountIsZero() {
        assertEquals(0, testLibrary.bookCount());
}
}
