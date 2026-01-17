import java.util.Scanner;

/*
 * This program checks different properties of a number:
 * - Whether it is Prime
 * - Whether it is Palindrome
 * - Whether it is Armstrong
 *
 * Each check is done using a separate method
 * to demonstrate method-based programming.
 */

public class NumberProperties {

    // Method to check if a number is Prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to square root of number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to check if a number is Palindrome
    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display results
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Armstrong: " + isArmstrong(number));
    }
}
