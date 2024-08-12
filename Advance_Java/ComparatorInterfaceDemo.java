package Advance_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceDemo {
    public static void main(String[] args) {
        // Create a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 450));
        books.add(new Book("Python Programming", 350));
        books.add(new Book("C++ Programming", 300));

        // Sort books using a custom Comparator (by title)
        Collections.sort(books, new TitleComparator());

        // Print the sorted list of books
        System.out.println("Books sorted by title:");
        for (Book book : books) {
            System.out.println(book.getTitle() + ": " + book.getPages() + " pages");
        }
    }
}

class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}

