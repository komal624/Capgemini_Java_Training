package feature.ObjectOrientedProgramming.EncapsulationPolymorphism;

public class FullTimeEmployee extends Employee implements Department {

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 5000; // fixed bonus
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Full Time - Dept: " + getDepartment();
    }
}
