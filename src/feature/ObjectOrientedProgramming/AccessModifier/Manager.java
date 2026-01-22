package feature.ObjectOrientedProgramming.AccessModifiers;

public class Manager extends Employee {

    public Manager(int id, String dept, double salary) {
        super(id, dept, salary);
    }

    // Runnable
    public static void main(String[] args) {
        Manager m1 =
                new Manager(201, "HR", 40000);

        // Accessing public and protected members
        System.out.println("Employee ID: " + m1.employeeID);
        System.out.println("Department: " + m1.department);
        System.out.println("Salary: " + m1.getSalary());
    }
}
