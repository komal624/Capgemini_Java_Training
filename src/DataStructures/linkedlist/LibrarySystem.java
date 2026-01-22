package DataStructures.linkedlist;


/*
 Library Management using Doubly Linked List

 Each node stores:
 - Book ID
 - Title
 - Author
 - Genre
 - Availability
*/

class BookNode {
    int id;
    String title;
    String author;
    String genre;
    boolean available;
    BookNode next, prev;

    BookNode(int id, String title, String author, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }
}

public class LibrarySystem {

    BookNode head, tail;

    void addBook(int id, String title, String author, String genre) {
        BookNode newNode = new BookNode(id, title, author, genre);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void removeBook(int id) {
        BookNode temp = head;

        while (temp != null && temp.id != id) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp == head) head = temp.next;
        if (temp == tail) tail = temp.prev;

        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.author + " Available: " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.title);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        LibrarySystem lib = new LibrarySystem();

        lib.addBook(1, "Java", "James", "Programming");
        lib.addBook(2, "DSA", "Mark", "Education");

        lib.displayForward();
        lib.displayReverse();
    }
}
