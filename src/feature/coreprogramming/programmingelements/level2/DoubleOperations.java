package feature.coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class DoubleOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        System.out.println("Addition = " + (number1 + number2));
        System.out.println("Subtraction = " + (number1 - number2));
        System.out.println("Multiplication = " + (number1 * number2));
        System.out.println("Division = " + (number1 / number2));

        input.close();
    }
}
