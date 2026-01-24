package DataStructures.linkedlist;

// Linked List Programs


/*
 Round Robin Scheduling using Circular Linked List

 Each node stores:
 - Process ID
 - Burst Time
*/

class ProcessNode {
    int id;
    int burst;
    ProcessNode next;

    ProcessNode(int id, int burst) {
        this.id = id;
        this.burst = burst;
    }
}

public class RoundRobin {

    ProcessNode head = null;

    void addProcess(int id, int burst) {
        ProcessNode newNode = new ProcessNode(id, burst);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    void run(int timeQuantum) {
        ProcessNode temp = head;

        while (true) {
            boolean done = true;

            do {
                if (temp.burst > 0) {
                    done = false;
                    System.out.println("Process " + temp.id + " running");

                    if (temp.burst > timeQuantum) {
                        temp.burst -= timeQuantum;
                    } else {
                        temp.burst = 0;
                    }
                }
                temp = temp.next;
            } while (temp != head);

            if (done) break;
        }
    }

    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();

        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.addProcess(3, 8);

        rr.run(3);
    }
}

