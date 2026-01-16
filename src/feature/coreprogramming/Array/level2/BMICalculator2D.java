import java.util.Scanner;

// Program to calculate BMI using 2D array
class BMICalculator2D {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Take input for height and weight
        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight of person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
        }

        // Calculate BMI and status
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0]);
            System.out.println("Height: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        input.close();
    }
}
