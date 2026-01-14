package feature.coreprogramming.programmingelements.level1;


public class AveragePCMMarks {

    public static void main(String[] args) {

        // Declare variables
        String studentName = "Sam";
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int mathsMarks = 94;

        // Calculate average
        double averageMarks = (physicsMarks + chemistryMarks + mathsMarks) / 3.0;

        // Display result
        System.out.println(
                studentName + "'s average mark in PCM is " + averageMarks
        );
    }
}