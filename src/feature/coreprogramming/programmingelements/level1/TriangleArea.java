package feature.coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base;
        double height;
        double areaCm;
        double areaInches;

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        areaCm = 0.5 * base * height;
        areaInches = areaCm / (2.54 * 2.54);

        System.out.println(
                "Area of triangle is " + areaCm +
                        " square cm and " + areaInches + " square inches"
        );

        input.close();
    }
}