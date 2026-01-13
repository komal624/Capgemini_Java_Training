package feature.coreprogramming.ControlFlows.level3;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double heightCm;
        double heightMeter;
        double bmi;

        System.out.print("Enter weight (kg): ");
        weight = input.nextDouble();

        System.out.print("Enter height (cm): ");
        heightCm = input.nextDouble();

        heightMeter = heightCm / 100;
        bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
