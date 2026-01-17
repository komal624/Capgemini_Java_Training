import java.util.Scanner;

class PowerCalculator {

    // Method to calculate power
    static int calculatePower(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter base number: ");
        int base = input.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();

        // Validate input
        if (exponent < 0) {
            System.out.println("Exponent must be a positive number.");
            System.exit(0);
        }

        // Call method
        int power = calculatePower(base, exponent);

        // Display output
        System.out.println("Result is: " + power);

        input.close();
    }
}
