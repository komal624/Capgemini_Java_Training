package DataStructures.linkedlist;


/*
 Online Ticket Reservation using Circular Linked List
*/

class TicketNode {
    int id;
    String customer;
    String movie;
    int seat;
    TicketNode next;

    TicketNode(int id, String customer, String movie, int seat) {
        this.id = id;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
    }
}

public class TicketSystem {

    TicketNode head = null;

    void addTicket(int id, String customer, String movie, int seat) {
        TicketNode newNode = new TicketNode(id, customer, movie, seat);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    void display() {
        if (head == null) return;

        TicketNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.customer + " " + temp.movie + " Seat: " + temp.seat);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();

        ts.addTicket(1, "Komal", "Avengers", 10);
        ts.addTicket(2, "Rahul", "Batman", 12);

        ts.display();
    }
}
