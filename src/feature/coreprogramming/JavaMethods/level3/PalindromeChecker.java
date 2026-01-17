import java.util.Scanner;

public class PalindromeChecker {

    // Method to check palindrome
    static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Method call
        if (isPalindrome(num)) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is Not a Palindrome");
        }
    }
}
