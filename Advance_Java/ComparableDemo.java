package Advance_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        // Create a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 450));
        books.add(new Book("Python Programming", 350));
        books.add(new Book("C++ Programming", 300));

        // Sort books using natural ordering (by page count)
        Collections.sort(books);

        // Print the sorted list of books
        System.out.println("Books sorted by page count:");
        for (Book book : books) {
            System.out.println(book.getTitle() + ": " + book.getPages() + " pages");
        }
    }
}

class Book implements Comparable<Book> {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.pages, other.pages);
    }
}

