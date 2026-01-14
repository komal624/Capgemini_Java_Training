package feature.coreprogramming.programmingelements.level1;

/*
 * Program Name: PenDistribution
 * Description: Calculates pens distributed per student and remaining pens
 */

public class PenDistribution {

    public static void main(String[] args) {

        // Declare variables
        int totalPens = 14;
        int numberOfStudents = 3;

        // Calculate distribution
        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;

        // Display result
        System.out.println(
                "The Pen Per Student is " + pensPerStudent +
                        " and the remaining pen not distributed is " + remainingPens
        );
    }
}
