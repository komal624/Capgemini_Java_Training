import java.util.Scanner;

class PrimeNumberChecker {

    // Method to check prime
    static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Call method
        boolean result = isPrime(num);

        // Display result
        if (result) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        input.close();
    }
}
