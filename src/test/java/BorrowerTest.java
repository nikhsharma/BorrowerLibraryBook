import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower testBorrower;
    Library testLibrary;
    Book testBook;

    @Before
    public void before() {
        testBorrower = new Borrower();
        testLibrary = new Library();
        testBook = new Book();
    }

    @Test
    public void borrowersCollectionIsEmpty() {
        assertEquals(0, testBorrower.bookCount());
    }
}
