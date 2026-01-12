package feature.coreprogramming.ControlFlows.level1;

import java.util.Scanner;

public class FirstSmallestChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        boolean isSmallest = number1 < number2 && number1 < number3;

        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}
