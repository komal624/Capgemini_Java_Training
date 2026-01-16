import java.util.Scanner;

// Program to calculate bonus and new salary of 10 employees
class EmployeeBonusCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Take input for salary and years of service
        for (int i = 0; i < 10; i++) {

            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();

            // Validate input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter valid values again.");
                i--; // Decrement index to retry
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            // Add to totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display totals
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
