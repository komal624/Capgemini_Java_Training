import java.util.Scanner;

// Program to calculate percentage and grade of students
class StudentGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Take marks input
        for (int i = 0; i < number; i++) {

            System.out.print("Enter Physics marks of student " + (i + 1) + ": ");
            physics[i] = input.nextInt();

            System.out.print("Enter Chemistry marks of student " + (i + 1) + ": ");
            chemistry[i] = input.nextInt();

            System.out.print("Enter Maths marks of student " + (i + 1) + ": ");
            maths[i] = input.nextInt();
        }

        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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
