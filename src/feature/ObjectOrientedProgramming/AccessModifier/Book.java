package feature.ObjectOrientedProgramming.AccessModifier;

public class Book {

    // Access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter
    public String getAuthor() {
        return author;
    }

    // Runnable
    public static void main(String[] args) {
        Book b1 = new Book("ISBN001", "Java Basics", "Komal");

        System.out.println("ISBN: " + b1.ISBN);
        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.getAuthor());

        b1.setAuthor("Amit");
        System.out.println("Updated Author: " + b1.getAuthor());
    }
}
