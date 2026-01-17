/*
 * This program converts different length units
 * using separate methods for each conversion.
 */

public class UnitConverter2 {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    // Main method
    public static void main(String[] args) {

        // Display conversion results
        System.out.println("5 Yards to Feet: " + convertYardsToFeet(5));
        System.out.println("6 Feet to Yards: " + convertFeetToYards(6));
        System.out.println("2 Meters to Inches: " + convertMetersToInches(2));
        System.out.println("10 Inches to CM: " + convertInchesToCm(10));
    }
}
