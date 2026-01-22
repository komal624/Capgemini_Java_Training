package feature.ObjectOrientedProgramming.StaticFinalInstanceOf;

public class Book {

    // Static (shared by all books)
    static String libraryName = "City Library";

    // Final (unique, cannot be changed)
    final String isbn;

    // Instance variables
    String title;
    String author;

    // Constructor using this
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("----------------------");
    }

    // Runnable + instanceof demo
    public static void main(String[] args) {

        Object obj = new Book("Java Basics", "Komal", "ISBN001");

        if (obj instanceof Book) {
            Book b1 = (Book) obj;
            Book.displayLibraryName();
            b1.displayDetails();
        }
    }
}
