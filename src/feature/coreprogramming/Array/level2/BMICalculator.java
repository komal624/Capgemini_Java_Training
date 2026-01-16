import java.util.Scanner;

// Program to calculate BMI of multiple persons
class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        // Take input
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
        }

        // Calculate BMI and status
        for (int i = 0; i < number; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + height[i]);
            System.out.println("Weight: " + weight[i]);
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }

        input.close();
    }
}
