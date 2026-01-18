package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * This program converts all uppercase characters in a string
 * to lowercase using ASCII logic and compares the result
 * with the built-in toLowerCase() method.
 */
public class Lowercase {

    // Method to convert text to lowercase using charAt()
    public static String convert(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Display results
        System.out.println("Custom Lowercase: " + convert(text));
        System.out.println("Built-in Lowercase: " + text.toLowerCase());

        sc.close();
    }
}
