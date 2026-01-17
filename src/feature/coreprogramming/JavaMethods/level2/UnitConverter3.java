/*
 * This program converts:
 * - Temperature
 * - Weight
 * - Volume
 * using different methods.
 */

public class UnitConverter3 {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    // Convert kilograms to pounds
    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method
    public static void main(String[] args) {

        // Display conversion results
        System.out.println("98F to Celsius: " + convertFahrenheitToCelsius(98));
        System.out.println("37C to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("10 Pounds to KG: " + convertPoundsToKg(10));
        System.out.println("5 Liters to Gallons: " + convertLitersToGallons(5));
    }
}
