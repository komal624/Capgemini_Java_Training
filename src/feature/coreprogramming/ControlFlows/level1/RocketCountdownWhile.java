package feature.coreprogramming.ControlFlows.level1;

import java.util.Scanner;

public class RocketCountdownWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter;

        System.out.print("Enter countdown value: ");
        counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        input.close();
    }
}