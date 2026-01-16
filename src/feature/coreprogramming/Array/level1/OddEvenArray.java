import java.util.Scanner;

// Program to store odd and even numbers in separate arrays
class OddEvenArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            input.close();
            return;
        }

        // Create arrays
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        // Store odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        // Display odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Display even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        input.close();
    }
}
