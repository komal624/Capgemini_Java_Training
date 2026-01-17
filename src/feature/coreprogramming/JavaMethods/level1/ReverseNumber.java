import java.util.Scanner;

class NumberReverse {

    // Method to reverse a number
    static int reverse(int number) {

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = (reversed * 10) + digit;
            number = number / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Validate input
        if (num < 0) {
            System.out.println("Invalid number. Enter a positive number.");
            System.exit(0);
        }

        // Call method
        int result = reverse(num);

        // Display result
        System.out.println("Reversed number is: " + result);

        input.close();
    }
}

