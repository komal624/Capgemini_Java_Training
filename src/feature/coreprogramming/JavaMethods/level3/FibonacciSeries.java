import java.util.Scanner;

public class FibonacciSeries {

    // Method to print Fibonacci series
    static void fibonacci(int terms) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Method call
        fibonacci(n);
    }
}
