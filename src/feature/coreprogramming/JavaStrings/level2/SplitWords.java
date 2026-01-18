package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * Splits text into words using charAt and compares with split()
 */
public class SplitWords {

    // Custom method to split words
    public static String[] splitCustom(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }
        words[index] = word;
        return words;
    }

    // Compare two string arrays
    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = splitCustom(text);
        String[] builtIn = text.split(" ");

        System.out.println("Match: " + compare(custom, builtIn));
        sc.close();
    }
}
