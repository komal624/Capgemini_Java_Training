import java.util.Scanner;

// Program to store up to 10 numbers and calculate their sum
class ArraySumLimit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create array of size 10
        double[] numbers = new double[10];

        // Variable to store sum
        double total = 0.0;

        // Index variable
        int index = 0;

        // Infinite loop
        while (true) {

            // Stop if array is full
            if (index >= numbers.length) {
                break;
            }

            // Take user input
            System.out.print("Enter a number: ");
            double value = input.nextDouble();

            // Stop if number is 0 or negative
            if (value <= 0) {
                break;
            }

            // Store value in array
            numbers[index] = value;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display result
        System.out.println("Sum of all numbers is: " + total);

        input.close();
    }
}
