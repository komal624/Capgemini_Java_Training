package feature.coreprogramming.programmingelements.level1;

/*
 * Program Name: FeeDiscountCalculator
 * Description: Calculates discount amount and final fee to be paid
 */

public class FeeDiscountCalculator {

    public static void main(String[] args) {

        // Declare variables
        double totalFee = 125000.0;
        double discountPercentage = 10.0;

        // Calculate discount amount
        double discountAmount = (totalFee * discountPercentage) / 100;

        // Calculate final fee after discount
        double finalFee = totalFee - discountAmount;

        // Display result
        System.out.println("Original Fee: INR " + totalFee);
        System.out.println("Discount Amount: INR " + discountAmount);
        System.out.println("Final Fee to be Paid: INR " + finalFee);
    }
}
