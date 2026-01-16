import java.util.Scanner;

// Program to find frequency of each digit in a number
class DigitFrequency {

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

        // Store digits in array
        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number = number / 10;
        }

        // Frequency array (0 to 9)
        int[] frequency = new int[10];

        // Count frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + " -> " + frequency[i]);
        }

        input.close();
    }
}
