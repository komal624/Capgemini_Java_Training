package feature.ObjectOrientedProgramming.AccessModifier;

public class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Runnable
    public static void main(String[] args) {
        EBook e1 = new EBook("ISBN002", "Python Guide", "Mark");

        // Accessing public and protected members
        System.out.println("ISBN: " + e1.ISBN);
        System.out.println("Title: " + e1.title);

        // Private member accessed via getter
        System.out.println("Author: " + e1.getAuthor());
    }
}


