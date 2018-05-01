import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;

    public Library() {
        bookCollection = new ArrayList<>();
    }

    public int bookCount() {
        return bookCollection.size();
    }

    public void addBook(Book book) {
        bookCollection.add(book);
    }
}
