package DataStructures.linkedlist;


/*
 Circular Linked List Example:
 Last node points back to head.

 Used for:
 - Task scheduling
 - Round robin systems
*/

class TaskNode {
    int id;
    String name;
    TaskNode next;

    TaskNode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class TaskScheduler {

    TaskNode head = null;
    TaskNode tail = null;

    void addTask(int id, String name) {
        TaskNode newNode = new TaskNode(id, name);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    void display() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();

        ts.addTask(1, "Study");
        ts.addTask(2, "Code");
        ts.addTask(3, "Sleep");

        ts.display();
    }
}
