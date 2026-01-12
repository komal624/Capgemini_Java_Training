package feature.coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class UniversityFeeDiscount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee;
        double discountPercent;
        double discountAmount;
        double finalFee;

        System.out.print("Enter student fee: ");
        fee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        discountPercent = input.nextDouble();

        discountAmount = (fee * discountPercent) / 100;
        finalFee = fee - discountAmount;

        System.out.println(
                "The discount amount is INR " + discountAmount +
                        " and final discounted fee is INR " + finalFee
        );

        input.close();
    }
}