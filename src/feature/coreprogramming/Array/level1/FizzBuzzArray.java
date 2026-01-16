import java.util.Scanner;

// Program to implement FizzBuzz using array
class FizzBuzzArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive number.");
            input.close();
            return;
        }

        // Create String array
        String[] result = new String[number + 1];

        // Store FizzBuzz results
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        // Display results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        input.close();
    }
}
