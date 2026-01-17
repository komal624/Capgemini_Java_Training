import java.util.Scanner;

class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Principal Amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        // Validate input
        if (principal <= 0 || rate <= 0 || time <= 0) {
            System.out.println("Invalid input. Values must be positive.");
            System.exit(0);
        }

        // Call method
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display result
        System.out.println("Simple Interest is: " + simpleInterest);

        // Close scanner
        input.close();
    }
}
