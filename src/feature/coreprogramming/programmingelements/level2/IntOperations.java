package feature.coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class IntOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.println("Addition = " + (number1 + number2));
        System.out.println("Subtraction = " + (number1 - number2));
        System.out.println("Multiplication = " + (number1 * number2));
        System.out.println("Division = " + (number1 / number2));

        input.close();
    }
}