package feature.coreprogramming.programmingelements.level1;

/*
 * Program Name: DistanceConverter
 * Description: Converts distance from kilometers to miles
 */

public class DistanceConverter {

    public static void main(String[] args) {

        // Declare variables
        double distanceInKilometers = 10.8;
        double conversionFactor = 1.6;

        // Convert kilometers to miles
        double distanceInMiles = distanceInKilometers / conversionFactor;

        // Display result
        System.out.println(
                "The distance " + distanceInKilometers +
                        " km in miles is " + distanceInMiles
        );
    }
}
