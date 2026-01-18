package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * This program finds all the occurrences (indexes) of a given character
 * in a string using the charAt() method.
 * It first counts how many times the character appears,
 * then stores the index positions in an integer array.
 */
public class FindCharacterOccurrences {

    /**
     * Finds all indexes of a character in a given string.
     *
     * @param text The input string
     * @param ch   The character to search for
     * @return An integer array containing all index positions of the character
     */
    public static int[] findAllIndexes(String text, char ch) {

        int count = 0;

        // Step 1: Count how many times the character occurs in the string
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        // Step 2: Create an array to store all index positions
        int[] indexes = new int[count];
        int j = 0;

        // Step 3: Store all indexes where the character is found
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indexes[j] = i;
                j++;
            }
        }

        return indexes;
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Take character input from user
        System.out.print("Enter a character to find occurrences: ");
        char ch = scanner.next().charAt(0);

        // Call method to find indexes
        int[] result = findAllIndexes(text, ch);

        // Display the result
        System.out.println("Indexes of character '" + ch + "':");
        for (int index : result) {
            System.out.print(index + " ");
        }

        // Close scanner
        scanner.close();
    }
}