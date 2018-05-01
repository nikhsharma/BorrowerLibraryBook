import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

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

    private boolean checkCapacity() {
        return this.bookCollection.size() < this.capacity;
    }

    public void addBook(Book book) {
        if (checkCapacity()) {
            this.bookCollection.add(book);
        }
    }

    public Book lendBook(int index) {
        return this.bookCollection.remove(index);
    }

    private HashMap booksByGenre() {
        ArrayList<String> genres = new ArrayList<>();
        HashMap<String, Integer> booksByGenre = new HashMap<>();

        for (Book book : bookCollection) {
            if (!genres.contains(book.getGenre())) {
                genres.add(book.getGenre());
            }
        }

        for (String genre : genres) {
            int counter = 0;
            for (Book book : bookCollection) {
                if (book.getGenre().equals(genre)) {
                    counter += 1;
                }
            }
            booksByGenre.put(genre, counter);
        }
        return booksByGenre;
    }

    public int bookCountByGenre(String genre) {
        return booksByGenre().get(genre).hashCode();
    }

}
