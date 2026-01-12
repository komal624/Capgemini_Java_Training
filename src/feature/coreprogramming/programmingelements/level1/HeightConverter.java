package feature.coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class HeightConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double heightInCm;
        double heightInInches;
        int feet;
        double inches;

        System.out.print("Enter height in centimeters: ");
        heightInCm = input.nextDouble();

        heightInInches = heightInCm / 2.54;
        feet = (int) (heightInInches / 12);
        inches = heightInInches % 12;

        System.out.println(
                "Your Height in cm is " + heightInCm +
                        " while in feet is " + feet +
                        " and inches is " + inches
        );

        input.close();
    }
}