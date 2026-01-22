package DataStructures.StackandQueues;



import java.util.Stack;

/*
 Stock Span Problem

 Problem:
 For each day, calculate the number of consecutive days
 before it where the stock price was less than or equal to today’s price.

 Logic:
 - Use a stack to store indices of days
 - Pop while current price is greater than stack top price
 - Span = current index - top index of stack
*/

public class StockSpan {

    static void calculateSpan(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[prices.length];

        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        System.out.println("Stock Spans:");
        for (int s : span) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        calculateSpan(prices);
    }
}
