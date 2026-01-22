package DataStructures.linkedlist;



/*
 Undo and Redo using Doubly Linked List
*/

class TextNode {
    String text;
    TextNode next, prev;

    TextNode(String text) {
        this.text = text;
    }
}

public class TextEditor {

    TextNode current;

    void type(String newText) {
        TextNode newNode = new TextNode(newText);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }

        current = newNode;
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void display() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
    }

    public static void main(String[] args) {
        TextEditor te = new TextEditor();

        te.type("Hello");
        te.type("Hello World");

        te.display();
        te.undo();
        te.display();
        te.redo();
        te.display();
    }
}
