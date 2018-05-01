import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookCollection;

    public Borrower() {
        this.bookCollection = new ArrayList<>();
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public void borrowBookFromLibrary(Library library, int index) {
        this.bookCollection.add(library.lendBook(index));
    }
}
