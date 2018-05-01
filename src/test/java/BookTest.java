import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        this.book = new Book("A Book", "Paper");
    }

    @Test
    public void hasTitle() {
        assertEquals("A Book", book.getTitle());
    }

    @Test
    public void hasGenre() {
        assertEquals("Paper", book.getGenre());
    }
}
