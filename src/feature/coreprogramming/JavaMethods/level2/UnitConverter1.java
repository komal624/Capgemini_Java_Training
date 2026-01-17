/*
 * This program converts different distance units
 * using separate methods for each conversion.
 */

public class UnitConverter1 {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    // Main method
    public static void main(String[] args) {

        // Display conversion results
        System.out.println("10 KM to Miles: " + convertKmToMiles(10));
        System.out.println("10 Miles to KM: " + convertMilesToKm(10));
        System.out.println("5 Meters to Feet: " + convertMetersToFeet(5));
        System.out.println("10 Feet to Meters: " + convertFeetToMeters(10));
    }
}
