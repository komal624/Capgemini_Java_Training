package feature.coreprogramming.ControlFlows.level3;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int originalNumber;
        int sum = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }

        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        input.close();
    }
}
