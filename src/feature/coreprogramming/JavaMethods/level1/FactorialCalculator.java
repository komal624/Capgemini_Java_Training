import java.util.Scanner;

class FactorialCalculator {

    // Method to calculate factorial
    static int calculateFactorial(int number) {

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Validate input
        if (num < 0) {
            System.out.println("Invalid number. Enter a positive number.");
            System.exit(0);
        }

        // Call method
        int result = calculateFactorial(num);

        // Display output
        System.out.println("Factorial of " + num + " is: " + result);

        input.close();
    }
}
