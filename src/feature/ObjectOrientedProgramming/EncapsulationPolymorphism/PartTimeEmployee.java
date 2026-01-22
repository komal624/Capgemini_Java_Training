package feature.ObjectOrientedProgramming.EncapsulationPolymorphism;

public class PartTimeEmployee extends Employee implements Department {

    int hoursWorked;
    double hourlyRate = 200;

    public PartTimeEmployee(int id, String name, int hoursWorked) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Part Time - Dept: " + getDepartment();
    }
}
