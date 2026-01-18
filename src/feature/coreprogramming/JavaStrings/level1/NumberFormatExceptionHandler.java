package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * This program demonstrates how a NumberFormatException occurs
 * when a non-numeric string is converted into an integer.
 * It also shows how to handle the exception using try-catch.
 */
public class NumberFormatExceptionHandler {

    /**
     * Method to generate NumberFormatException
     * This method tries to convert a non-numeric string into an integer.
     *
     * @param text Input string provided by the user
     */
    public static void generateException(String text) {

        // This will throw NumberFormatException if text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }

    /**
     * Method to handle NumberFormatException safely
     *
     * @param text Input string provided by the user
     */
    public static void handleException(String text) {

        try {
            // Try converting string to integer
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);

        } catch (NumberFormatException e) {
            // Handle specific NumberFormatException
            System.out.println("Handled NumberFormatException: Invalid numeric format.");

        } catch (RuntimeException e) {
            // Handle any other runtime exception
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number in text format: ");
        String text = scanner.nextLine();

        // Uncomment this line to see how the program crashes
        // generateException(text);

        // Safe execution with exception handling
        handleException(text);

        // Close scanner
        scanner.close();
    }
}
