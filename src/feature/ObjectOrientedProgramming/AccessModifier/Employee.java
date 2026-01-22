package feature.ObjectOrientedProgramming.AccessModifiers;

public class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int id, String dept, double salary) {
        this.employeeID = id;
        this.department = dept;
        this.salary = salary;
    }

    // Public method to modify private salary
    public void updateSalary(double newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }

    // Runnable
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "IT", 30000);
        System.out.println("Salary: " + e1.getSalary());

        e1.updateSalary(35000);
        System.out.println("Updated Salary: " + e1.getSalary());
    }
}
