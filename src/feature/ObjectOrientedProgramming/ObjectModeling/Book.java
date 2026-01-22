package feature.ObjectOrientedProgramming.ObjectModeling;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

