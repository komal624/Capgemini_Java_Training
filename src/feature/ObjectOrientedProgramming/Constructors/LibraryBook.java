package feature.ObjectOrientedProgramming.Constructors;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Parameterized constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Book not available.");
        }
    }

    // Makes this class runnable
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Data Structures", "Mark", 450);

        b1.borrowBook();  // first time - available
        b1.borrowBook();  // second time - not available
    }
}

