import java.util.Scanner;

public class PrimeChecker {

    // Method to check prime
    static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Method call
        if (isPrime(num)) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is Not Prime");
        }
    }
}
