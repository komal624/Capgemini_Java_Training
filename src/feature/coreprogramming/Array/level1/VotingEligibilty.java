import java.util.Scanner;

// Program to check voting eligibility of 10 students using an array
class VotingEligibility {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create array to store ages of 10 students
        int[] ages = new int[10];

        // Take input for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age entered: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        // Close scanner
        input.close();
    }
}
