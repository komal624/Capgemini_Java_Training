package feature.coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int temp;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After swapping:");
        System.out.println("First number = " + number1);
        System.out.println("Second number = " + number2);

        input.close();
    }
}
