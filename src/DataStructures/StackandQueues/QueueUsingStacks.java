package DataStructures.StackandQueues;


import java.util.Stack;

/*
 Implement a Queue Using Two Stacks

 Problem:
 Design a queue using two stacks such that enqueue and dequeue
 operations are performed efficiently.

 Logic:
 - Use stack1 for enqueue operation
 - Use stack2 for dequeue operation
 - When stack2 is empty, transfer all elements from stack1 to stack2
*/

public class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation
    void enqueue(int value) {
        stack1.push(value);
        System.out.println("Inserted: " + value);
    }

    // Dequeue operation
    void dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Removed: " + stack2.pop());
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
        q.dequeue();
    }
}
