package feature.coreprogramming.programmingelements.level1;

/*
 * Program Name: EarthVolumeCalculator
 * Description: Calculates the volume of Earth in cubic kilometers and cubic miles
 */

public class EarthVolumeCalculator {

    public static void main(String[] args) {

        // Declare variables
        double radiusInKilometers = 6378.0;
        double piValue = Math.PI;

        // Calculate volume in cubic kilometers
        double volumeInCubicKilometers =
                (4.0 / 3.0) * piValue *
                        radiusInKilometers * radiusInKilometers * radiusInKilometers;

        // Conversion factor from km to miles
        double kilometerToMileFactor = 1.6;

        // Convert volume to cubic miles
        double volumeInCubicMiles =
                volumeInCubicKilometers /
                        (kilometerToMileFactor * kilometerToMileFactor * kilometerToMileFactor);

        // Display result
        System.out.println(
                "The volume of Earth in cubic kilometers is " + volumeInCubicKilometers
        );
        System.out.println(
                "The volume of Earth in cubic miles is " + volumeInCubicMiles
        );
    }
}
