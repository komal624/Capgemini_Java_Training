package feature.coreprogramming.ControlFlows.level3;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int physics, chemistry, maths;
        double average;

        System.out.print("Enter Physics marks: ");
        physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        maths = input.nextInt();

        average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks = " + average);

        if (average >= 90) {
            System.out.println("Grade: A | Remark: Excellent");
        } else if (average >= 75) {
            System.out.println("Grade: B | Remark: Very Good");
        } else if (average >= 60) {
            System.out.println("Grade: C | Remark: Good");
        } else if (average >= 40) {
            System.out.println("Grade: D | Remark: Pass");
        } else {
            System.out.println("Grade: F | Remark: Fail");
        }

        input.close();
    }
}