package feature.coreprogramming.ControlFlows.level2;

import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ageAmar, ageAkbar, ageAnthony;
        double heightAmar, heightAkbar, heightAnthony;

        System.out.print("Enter Amar's age: ");
        ageAmar = input.nextInt();
        System.out.print("Enter Amar's height: ");
        heightAmar = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        ageAkbar = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        heightAkbar = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        ageAnthony = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        heightAnthony = input.nextDouble();

        // Youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        System.out.println("Youngest age is " + youngestAge);

        // Tallest
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        System.out.println("Tallest height is " + tallestHeight);

        input.close();
    }
}