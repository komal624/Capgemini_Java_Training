import java.util.Scanner;

// Program to calculate student grades using 2D array
class StudentGrades2D {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Take input
        for (int i = 0; i < number; i++) {

            System.out.print("Enter Physics marks of student " + (i + 1) + ": ");
            marks[i][0] = input.nextInt();

            System.out.print("Enter Chemistry marks of student " + (i + 1) + ": ");
            marks[i][1] = input.nextInt();

            System.out.print("Enter Maths marks of student " + (i + 1) + ": ");
            marks[i][2] = input.nextInt();
        }

        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 50) {
                grade[i] = "C";
            } else {
                grade[i] = "Fail";
            }
        }

        // Display results
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        input.close();
    }
}
