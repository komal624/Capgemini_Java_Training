import java.util.Scanner;

class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Call method
        double fahrenheit = convertToFahrenheit(celsius);

        // Display result
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

        input.close();
    }
}
