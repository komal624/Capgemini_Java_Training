package feature.coreprogramming.ControlFlows.level2;

import java.util.Scanner;

public class FactorsForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input");
            input.close();
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
