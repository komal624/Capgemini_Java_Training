package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * This program demonstrates how an IllegalArgumentException occurs
 * when invalid arguments are passed to a method.
 * Here, substring() is called with a start index greater than the end index.
 * It also shows how to safely handle the exception using try-catch.
 */
public class IllegalArgumentExceptionHandler {

    /**
     * Method to generate IllegalArgumentException
     * This method calls substring() with invalid index values.
     *
     * @param text Input string provided by the user
     */
    public static void generateException(String text) {

        // Start index is greater than end index (invalid case)
        // This will cause IllegalArgumentException
        System.out.println(text.substring(5, 2));
    }

    /**
     * Method to handle IllegalArgumentException safely
     *
     * @param text Input string provided by the user
     */
    public static void handleException(String text) {

        try {
            // Attempt to call substring with invalid arguments
            System.out.println(text.substring(5, 2));

        } catch (IllegalArgumentException e) {
            // Handle specific IllegalArgumentException
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());

        } catch (RuntimeException e) {
            // Handle any other runtime exception
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Uncomment this line to see how the program crashes
        // generateException(text);

        // Safe execution with exception handling
        handleException(text);

        // Close scanner
        scanner.close();
    }
}
