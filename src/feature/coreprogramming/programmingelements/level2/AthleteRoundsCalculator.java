package feature.coreprogramming.programmingelements.level2;
import java.util.Scanner;

public class AthleteRoundsCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalDistance;
        double trackLength = 400;
        double rounds;

        System.out.print("Enter total distance covered (meters): ");
        totalDistance = input.nextDouble();

        rounds = totalDistance / trackLength;

        System.out.println("Total rounds completed = " + rounds);

        input.close();
    }
}