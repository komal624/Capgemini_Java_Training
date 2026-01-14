package feature.coreprogramming.ControlFlows.level2;

import java.util.Scanner;

public class GreatestFactorWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int greatestFactor = 1;
        int counter;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        counter = number - 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor is " + greatestFactor);

        input.close();
    }
}
