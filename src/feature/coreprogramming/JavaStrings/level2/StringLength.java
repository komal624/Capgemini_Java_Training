package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * Finds length of a string without using length() method
 */
public class StringLength {

    // Method to find length using charAt and exception
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println("Custom Length: " + findLength(text));
        System.out.println("Built-in Length: " + text.length());

        sc.close();
    }
}
