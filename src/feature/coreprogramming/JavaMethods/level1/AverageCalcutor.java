import java.util.Scanner;

class AverageCalculator {

    // Method to calculate average
    static double calculateAverage(int sum, int count) {
        return (double) sum / count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take count input
        System.out.print("Enter number of values: ");
        int count = input.nextInt();

        // Validate input
        if (count <= 0) {
            System.out.println("Invalid count.");
            System.exit(0);
        }

        int sum = 0;

        // Take numbers
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            sum += number;
        }

        // Call method
        double average = calculateAverage(sum, count);

        // Display result
        System.out.println("Average is: " + average);

        input.close();
    }
}
