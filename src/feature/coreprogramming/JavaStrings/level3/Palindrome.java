package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program checks if a string is palindrome
 * using start and end index logic.
 */
public class Palindrome {

    public static boolean check(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Palindrome: " + check(text));
        sc.close();
    }
}
