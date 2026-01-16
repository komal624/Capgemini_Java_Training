import java.util.Scanner;

// Program to analyze numbers and compare first and last elements
class NumberAnalysis {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create array of size 5
        int[] numbers = new int[5];

        // Take user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first > last) {
            System.out.println("First element is greater than Last element");
        } else if (first < last) {
            System.out.println("First element is less than Last element");
        } else {
            System.out.println("First and Last elements are equal");
        }

        // Close scanner
        input.close();
    }
}
