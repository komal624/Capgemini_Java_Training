import java.util.Scanner;

public class SumOfDigits {

    // Method to find sum of digits
    static int sumDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Method call
        int result = sumDigits(num);

        // Output
        System.out.println("Sum of Digits = " + result);
    }
}
