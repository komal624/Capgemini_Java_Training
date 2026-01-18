package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program counts the number of vowels and consonants in a string.
 * It converts uppercase letters to lowercase using ASCII logic
 * and then checks whether each character is a vowel, consonant,
 * or not a letter.
 */
public class VowelCount {

    /*
     * Checks whether a character is a vowel
     */
    public static boolean isVowel(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
    }

    /*
     * Counts vowels and consonants in the given text
     * Returns an array where:
     * index 0 = vowel count
     * index 1 = consonant count
     */
    public static int[] count(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] result = count(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}
