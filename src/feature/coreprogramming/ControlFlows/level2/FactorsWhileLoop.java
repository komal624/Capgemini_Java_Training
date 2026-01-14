package feature.coreprogramming.ControlFlows.level2;

import java.util.Scanner;

public class FactorsWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int counter = 1;

        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        while (counter < number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }

        input.close();
    }
}
