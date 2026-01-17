import java.util.Scanner;

class MaximumNumber {

    // Method to find maximum
    static int findMaximum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Call method
        int result = findMaximum(number1, number2);

        // Display result
        System.out.println("Maximum number is: " + result);

        input.close();
    }
}
