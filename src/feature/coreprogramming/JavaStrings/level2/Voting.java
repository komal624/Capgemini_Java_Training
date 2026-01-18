package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program generates random ages for students
 * and checks whether each student can vote.
 * A student can vote if age is 18 or above.
 * The result is displayed in a table format.
 */
public class Voting {

    /*
     * Generates random ages for students
     */
    public static int[] generateAges(int n) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90);
        }

        return ages;
    }

    /*
     * Checks voting eligibility and returns result in 2D array
     */
    public static String[][] check(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[][] table = check(generateAges(n));

        System.out.println("AGE\tSTATUS");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        sc.close();
    }
}
