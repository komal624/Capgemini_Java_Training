package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program calculates BMI for multiple people.
 * It takes height (cm) and weight (kg),
 * converts height into meters,
 * calculates BMI and shows health status.
 */
public class BMI {

    /*
     * Calculates BMI and status
     */
    public static String[][] calculate(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeter = data[i][1] / 100;

            double bmi = weight / (heightMeter * heightMeter);
            String status;

            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[5][2];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] table = calculate(data);

        System.out.println("HEIGHT\tWEIGHT\tBMI\tSTATUS");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }

        sc.close();
    }
}
