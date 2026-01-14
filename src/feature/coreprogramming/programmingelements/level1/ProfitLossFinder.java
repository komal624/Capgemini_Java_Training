package feature.coreprogramming.programmingelements.level1;

/*
 * Program Name: ProfitLossFinder
 * Description: Calculates profit or loss and profit/loss percentage
 */

public class ProfitLossFinder {

    public static void main(String[] args) {

        // Declare variables
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        // Calculate profit or loss
        double difference = sellingPrice - costPrice;
        double percentage = (difference / costPrice) * 100;

        // Check profit or loss condition
        if (difference > 0) {
            System.out.println("Profit = INR " + difference);
            System.out.println("Profit Percentage = " + percentage);
        } else if (difference < 0) {
            System.out.println("Loss = INR " + Math.abs(difference));
            System.out.println("Loss Percentage = " + Math.abs(percentage));
        } else {
            System.out.println("No Profit, No Loss");
        }
    }
}
