package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * This program converts all lowercase characters in a string
 * to uppercase using ASCII logic and compares the result
 * with the built-in toUpperCase() method.
 */
public class Uppercase {

    // Method to convert text to uppercase using charAt()
    public static String convert(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII difference
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    // Method to compare two strings
    public static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Custom conversion
        String customUpper = convert(text);

        // Built-in conversion
        String builtInUpper = text.toUpperCase();

        // Display results
        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Match: " + compare(customUpper, builtInUpper));

        sc.close();
    }
}
