package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program generates random marks for students
 * in Physics, Chemistry, and Math.
 * It calculates percentage and assigns grade
 * and displays the scorecard in table format.
 */
public class Grades {

    /*
     * Generates random scores for students
     */
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + (int) (Math.random() * 90);
            scores[i][1] = 10 + (int) (Math.random() * 90);
            scores[i][2] = 10 + (int) (Math.random() * 90);
        }

        return scores;
    }

    /*
     * Returns grade based on percentage
     */
    public static String grade(double percent) {
        if (percent >= 90) return "A";
        if (percent >= 75) return "B";
        if (percent >= 60) return "C";
        return "D";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);

        System.out.println("PHY\tCHEM\tMATH\tPERCENT\tGRADE");

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double percent = Math.round((total / 3.0) * 100) / 100.0;

            System.out.println(
                    scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            percent + "\t" +
                            grade(percent)
            );
        }

        sc.close();
    }
}
