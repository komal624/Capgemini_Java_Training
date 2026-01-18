package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program finds the first non-repeating character
 * using ASCII frequency logic.
 */
public class FirstUnique {

    /*
     * Finds first unique character
     */
    public static char find(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);
        }

        return '-';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = find(text);
        System.out.println("First Non-Repeating Character: " + result);

        sc.close();
    }
}

