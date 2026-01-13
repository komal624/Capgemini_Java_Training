package feature.coreprogramming.ControlFlows.level3;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first;
        double second;
        String operator;

        System.out.print("Enter first number: ");
        first = input.nextDouble();

        System.out.print("Enter second number: ");
        second = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next();

        switch (operator) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;
            case "-":
                System.out.println("Result = " + (first - second));
                break;
            case "*":
                System.out.println("Result = " + (first * second));
                break;
            case "/":
                System.out.println("Result = " + (first / second));
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}