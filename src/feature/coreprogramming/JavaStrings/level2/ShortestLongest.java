package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program splits a sentence into words and
 * finds the shortest and longest word.
 * It uses a custom method to find the length of each word
 * without using the built-in length() method.
 */
public class ShortestLongest {

    /*
     * Splits the input text into words using space as separator
     */
    public static String[] split(String text) {
        return text.split(" ");
    }

    /*
     * Finds length of a word without using length() method
     * It keeps accessing characters until an exception occurs
     */
    public static int length(String word) {
        int count = 0;

        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    /*
     * Finds indexes of shortest and longest words
     * Returns an array where:
     * index 0 = shortest word index
     * index 1 = longest word index
     */
    public static int[] find(String[] words) {
        int min = 0;
        int max = 0;

        for (int i = 1; i < words.length; i++) {
            if (length(words[i]) < length(words[min])) {
                min = i;
            }

            if (length(words[i]) > length(words[max])) {
                max = i;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = split(text);
        int[] result = find(words);

        System.out.println("Shortest Word: " + words[result[0]]);
        System.out.println("Longest Word: " + words[result[1]]);

        sc.close();
    }
}
