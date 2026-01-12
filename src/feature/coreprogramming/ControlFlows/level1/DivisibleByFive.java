package feature.coreprogramming.ControlFlows.level1;
import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? true");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? false");
        }

        input.close();
    }
}


