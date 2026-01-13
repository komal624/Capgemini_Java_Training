package feature.coreprogramming.ControlFlows.level3;

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;
        int temp;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        input.close();
    }
}