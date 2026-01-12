package feature.coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class TravelComputationInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceFromToVia;
        double distanceViaToFinal;
        double totalDistance;

        System.out.print("Enter distance from source to via: ");
        distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from via to destination: ");
        distanceViaToFinal = input.nextDouble();

        totalDistance = distanceFromToVia + distanceViaToFinal;

        System.out.println("Total distance travelled = " + totalDistance);

        input.close();
    }
}