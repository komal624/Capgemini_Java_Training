package DataStructures.linkedlist;



/*
 Doubly Linked List Example:
 Each node stores movie information.

 Features:
 - Add movie at end
 - Remove by title
 - Display forward
 - Display reverse
*/

class MovieNode {
    String title;
    String director;
    int year;
    double rating;

    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieList {

    MovieNode head;
    MovieNode tail;

    void addMovie(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieList list = new MovieList();

        list.addMovie("Inception", "Nolan", 2010, 9.0);
        list.addMovie("Avatar", "Cameron", 2009, 8.5);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Reverse:");
        list.displayReverse();
    }
}
