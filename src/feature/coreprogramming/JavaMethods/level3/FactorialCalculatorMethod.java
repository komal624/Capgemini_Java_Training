import java.util.Scanner;

public class FactorialCalculatorMethod {

    // Method to calculate factorial
    static int factorial(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Method call
        int result = factorial(num);

        // Output
        System.out.println("Factorial = " + result);
    }
}
