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
        testBook = new Book("A Book", "Paper");
        testLibrary.addBook(testBook);
        testLibrary.addBook(testBook);
        testLibrary.addBook(testBook);
        testLibrary.addBook(testBook);
    }

    @Test
    public void borrowersCollectionIsEmpty() {
        assertEquals(0, testBorrower.bookCount());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        testBorrower.borrowBookFromLibrary(testLibrary, 1);
        assertEquals(1, testBorrower.bookCount());
        assertEquals(3, testLibrary.bookCount());
    }
}
