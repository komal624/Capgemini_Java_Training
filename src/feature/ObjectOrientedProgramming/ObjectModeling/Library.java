package feature.ObjectOrientedProgramming.ObjectModeling;

import java.util.ArrayList;

public class Library {

    String name;
    ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
        System.out.println("----------------------");
    }

    // Runnable
    public static void main(String[] args) {

        // Books exist independently
        Book b1 = new Book("Java Basics", "Komal");
        Book b2 = new Book("Python Guide", "Amit");

        // Two libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Aggregation: same books can be added to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1);

        lib1.displayBooks();
        lib2.displayBooks();
    }
}

