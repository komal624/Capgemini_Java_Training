package feature.coreprogramming.ControlFlows.level3;

import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);

        input.close();
    }
}
