package feature.coreprogramming.ControlFlows.level2;

import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary;
        int yearsOfService;
        double bonus;

        System.out.print("Enter salary: ");
        salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("No bonus applicable");
        }

        input.close();
    }
}