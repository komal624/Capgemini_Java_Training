import java.util.Scanner;

public class MaximumFinder {

    // Method to find maximum
    static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Method call
        int result = findMax(a, b, c);

        // Output
        System.out.println("Maximum Number = " + result);
    }
}
