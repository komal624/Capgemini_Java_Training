package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program finds unique characters in a string
 * using nested loops and charAt() method.
 */
public class UniqueChars {

    /*
     * Returns unique characters
     */
    public static char[] find(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }

            if (unique) temp[index++] = ch;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = find(text);

        System.out.print("Unique Characters: ");
        for (char c : unique) System.out.print(c + " ");

        sc.close();
    }
}
