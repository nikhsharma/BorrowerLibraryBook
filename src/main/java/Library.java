import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library() {
        this.bookCollection = new ArrayList<>();
        this.capacity = 4;
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (checkCapacity()) {
            this.bookCollection.add(book);
        }
    }

    public boolean checkCapacity() {
        return this.bookCollection.size() < this.capacity;
    }
}
