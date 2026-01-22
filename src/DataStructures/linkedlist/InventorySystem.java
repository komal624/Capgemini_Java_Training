package DataStructures.linkedlist;


/*
 Inventory Management System using Singly Linked List

 Each node stores:
 - Item ID
 - Item Name
 - Quantity
 - Price

 Features:
 1. Add item (beginning, end)
 2. Remove item by ID
 3. Update quantity
 4. Search by ID or Name
 5. Calculate total inventory value
*/

class ItemNode {
    int id;
    String name;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventorySystem {

    ItemNode head;

    void addAtEnd(int id, String name, int quantity, double price) {
        ItemNode newNode = new ItemNode(id, name, quantity, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void removeById(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    void search(String key) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(key) || String.valueOf(temp.id).equals(key)) {
                System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void totalValue() {
        double sum = 0;
        ItemNode temp = head;

        while (temp != null) {
            sum += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = " + sum);
    }

    void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.id + " | " + temp.name + " | " + temp.quantity + " | " + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InventorySystem inv = new InventorySystem();

        inv.addAtEnd(1, "Pen", 10, 5);
        inv.addAtEnd(2, "Book", 5, 50);

        inv.display();
        inv.search("Book");

        inv.updateQuantity(1, 20);
        inv.totalValue();

        inv.removeById(2);
        inv.display();
    }
}
