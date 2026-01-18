package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * This program creates a substring using the charAt() method
 * and compares it with the built-in substring() method.
 */
public class SubstringUsingCharAt {

    /**
     * Creates a substring using charAt()
     * @param text Input string
     * @param start Starting index
     * @param end Ending index
     * @return Substring created manually
     */
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        // Loop through given index range and build substring
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    /**
     * Compares two strings using charAt()
     */
    public static boolean compareStrings(String s1, String s2) {

        // Check length first
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare characters one by one
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring using custom method
        String customSub = createSubstring(text, start, end);

        // Create substring using built-in method
        String builtInSub = text.substring(start, end);

        // Display results
        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Are both equal: " + compareStrings(customSub, builtInSub));

        sc.close();
    }
}
