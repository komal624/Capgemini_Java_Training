package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program checks each character in a string and
 * displays whether it is a Vowel, Consonant, or Not a Letter.
 * The result is displayed in a tabular format.
 */
public class CharType {

    /*
     * Checks the type of a single character
     */
    public static String check(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("CHAR\tTYPE");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + "\t" + check(text.charAt(i)));
        }

        sc.close();
    }
}
