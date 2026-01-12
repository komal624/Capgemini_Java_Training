package feature.coreprogramming.ControlFlows.level2;


import java.util.Scanner;

public class FizzBuzzWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int counter = 1;

        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input");
            input.close();
            return;
        }

        while (counter <= number) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(counter);
            }
            counter++;
        }

        input.close();
    }
}