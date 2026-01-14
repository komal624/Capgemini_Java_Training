package feature.coreprogramming.ControlFlows.level1;

import java.util.Scanner;

public class RocketCountdownFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter;

        System.out.print("Enter countdown value: ");
        counter = input.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        input.close();
    }
}