package feature.coreprogramming.programmingelements.level2;
import java.util.Scanner;

public class TotalIncomeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary;
        double bonus;
        double totalIncome;

        System.out.print("Enter salary: ");
        salary = input.nextDouble();

        System.out.print("Enter bonus: ");
        bonus = input.nextDouble();

        totalIncome = salary + bonus;

        System.out.println("Total Income = " + totalIncome);

        input.close();
    }
}