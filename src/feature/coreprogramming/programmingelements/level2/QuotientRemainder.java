package feature.coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dividend;
        int divisor;
        int quotient;
        int remainder;

        System.out.print("Enter dividend: ");
        dividend = input.nextInt();

        System.out.print("Enter divisor: ");
        divisor = input.nextInt();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        input.close();
    }
}
