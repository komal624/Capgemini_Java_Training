import java.util.Scanner;

public class FactorOperations {

    // Method to find factors and return as array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array of exact size
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to find product of factors
    public static int findProduct(int[] array) {
        int product = 1;
        for (int value : array) {
            product *= value;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors:");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum: " + findSum(factors));
        System.out.println("Product: " + findProduct(factors));
        System.out.println("Sum of Squares: " + findSumOfSquares(factors));
    }
}
