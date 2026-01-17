import java.util.Scanner;

/*
 * This program validates a password based on:
 * - Minimum length of 8 characters
 * - At least one uppercase letter
 * - At least one lowercase letter
 * - At least one digit
 *
 * Each validation is done using separate methods.
 */

public class PasswordValidator {

    // Method to check minimum length
    public static boolean checkLength(String password) {
        return password.length() >= 8;
    }

    // Method to check uppercase letter
    public static boolean hasUppercase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    // Method to check lowercase letter
    public static boolean hasLowercase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }

    // Method to check digit
    public static boolean hasDigit(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    // Method to validate complete password
    public static boolean isValidPassword(String password) {
        return checkLength(password) &&
                hasUppercase(password) &&
                hasLowercase(password) &&
                hasDigit(password);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take password input
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validate password
        if (isValidPassword(password)) {
            System.out.println("Password is Strong.");
        } else {
            System.out.println("Password is Weak. Please follow rules:");
            System.out.println("- Minimum 8 characters");
            System.out.println("- At least one uppercase letter");
            System.out.println("- At least one lowercase letter");
            System.out.println("- At least one digit");
        }
    }
}

