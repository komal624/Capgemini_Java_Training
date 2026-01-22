package feature.ObjectOrientedProgramming.Constructors;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }


    public static void main(String[] args) {
        Book b1 = new Book();  // default
        b1.display();

        Book b2 = new Book("Java OOP", "Komal", 299.0); // parameterized
        b2.display();
    }
}
