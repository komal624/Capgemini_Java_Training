package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * This program converts a string into a character array
 * using a user-defined method and compares it with the
 * built-in toCharArray() method.
 */
public class StringToCharArray {

    /**
     * Converts string to char array using charAt()
     */
    public static char[] getChars(String text) {

        // Create character array of same length as string
        char[] result = new char[text.length()];

        // Store each character in array
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    /**
     * Compares two character arrays
     */
    public static boolean compareArrays(char[] a, char[] b) {

        // If lengths differ, arrays are not equal
        if (a.length != b.length) {
            return false;
        }

        // Compare each element
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter text: ");
        String text = sc.next();

        // Custom conversion
        char[] customArray = getChars(text);

        // Built-in conversion
        char[] builtInArray = text.toCharArray();

        // Compare results
        System.out.println("Do both arrays match: " + compareArrays(customArray, builtInArray));

        sc.close();
    }
}
