package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program removes leading and trailing spaces
 * from a string using charAt() method.
 * It finds the starting and ending index of non-space
 * characters and then creates a substring manually.
 */
public class TrimText {

    /*
     * Finds the start and end indexes after trimming spaces
     */
    public static int[] findBounds(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ') {
            start++;
        }

        while (text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    /*
     * Creates substring using charAt()
     */
    public static String substring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] bounds = findBounds(text);
        String customTrim = substring(text, bounds[0], bounds[1]);

        System.out.println("Custom Trim: [" + customTrim + "]");
        System.out.println("Built-in Trim: [" + text.trim() + "]");

        sc.close();
    }
}
