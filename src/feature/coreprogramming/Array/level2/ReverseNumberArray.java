import java.util.Scanner;

// Program to reverse a number using array
class ReverseNumberArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int index = 0;

        // Store digits
        while (number != 0) {
            digits[index++] = number % 10;
            number = number / 10;
        }

        // Display reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}
