package DataStructures.linkedlist;


/*
 This program demonstrates a Singly Linked List for managing student records.

 Each node stores:
 - Roll Number
 - Name
 - Age
 - Grade

 Operations:
 - Add student at beginning
 - Delete student by roll number
 - Search student
 - Display all students
*/

class StudentNode {
    int roll;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentList {

    StudentNode head;

    void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    void deleteByRoll(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.roll != roll) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void search(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.name + " Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();

        list.addAtBeginning(1, "Komal", 20, "A");
        list.addAtBeginning(2, "Rahul", 21, "B");

        list.display();
        list.search(1);
        list.deleteByRoll(2);

        System.out.println("After Deletion:");
        list.display();
    }
}
