public class Library_ArrayOFObjects_usingforeach {
    public static void main(String[] args) {
        // Create an array to store Book objects
        Book[] books = new Book[3];

        // Populate the array with Book objects
        books[0] = new Book("1984", "George Orwell", 1949);
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        books[2] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        // Use a for-each loop to display information about each book
        System.out.println("Library Book Collection:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

// Book class definition
class Book {
    private String title;
    private String author;
    private int year;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}

