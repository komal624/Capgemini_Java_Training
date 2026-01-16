import java.util.Scanner;

// Program to find factors of a number using dynamic array resizing
class FactorFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initial max size of factors array
        int maxFactor = 10;

        // Create factors array
        int[] factors = new int[maxFactor];

        int index = 0;

        // Find factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // Resize array if full
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
