package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * This program demonstrates how a StringIndexOutOfBoundsException occurs
 * when we try to access a character index that is outside the valid range
 * of a string.
 * It also shows how to handle this exception using a try-catch block.
 */
public class StringIndexOutOfBoundsDemo {

    /**
     * Method to generate StringIndexOutOfBoundsException
     * This will try to access a character at an invalid index.
     *
     * @param text Input string provided by the user
     */
    public static void generateException(String text) {

        // This will always be an invalid index because
        // valid indexes are from 0 to text.length() - 1
        System.out.println(text.charAt(text.length()));
    }

    /**
     * Method to handle StringIndexOutOfBoundsException safely
     *
     * @param text Input string provided by the user
     */
    public static void handleException(String text) {

        try {
            // Attempt to access an invalid index
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            // Catch and handle the runtime exception
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
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
