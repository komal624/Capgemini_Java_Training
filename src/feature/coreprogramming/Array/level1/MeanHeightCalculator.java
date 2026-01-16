import java.util.Scanner;

// Program to calculate mean height of football players
class MeanHeightCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create array for 11 players
        double[] heights = new double[11];

        double sum = 0;

        // Take height input
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display result
        System.out.println("Mean height of football team is: " + mean);

        input.close();
    }
}
