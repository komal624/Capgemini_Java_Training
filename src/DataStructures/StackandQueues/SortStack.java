package DataStructures.StackandQueues;


import java.util.Stack;

/*
 Sort a Stack Using Recursion

 Problem:
 Given a stack, sort its elements in ascending order using recursion.

 Logic:
 - Pop the top element
 - Recursively sort the remaining stack
 - Insert the popped element back at the correct position
*/

public class SortStack {

    static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            insert(stack, temp);
        }
    }

    static void insert(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insert(stack, value);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(40);
        stack.push(20);

        sort(stack);

        System.out.println("Sorted Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
