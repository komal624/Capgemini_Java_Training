import java.util.Scanner;

/*
 * This program counts the number of
 * vowels and consonants in a given string.
 *
 * It uses separate methods to:
 * - Check for vowels
 * - Count vowels and consonants
 */

public class VowelConsonantCounter {

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
    }

    // Method to count vowels and consonants
    public static void countCharacters(String text) {
        int vowels = 0;
        int consonants = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check only alphabet characters
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Display results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call counting method
        countCharacters(input);
    }
}

