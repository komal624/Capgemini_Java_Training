package feature.ObjectOrientedProgramming.EncapsulationPolymorphism;

import java.util.ArrayList;

public class EmployeeSystem {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Komal", 30000);
        Employee e2 = new PartTimeEmployee(102, "Amit", 40);

        ((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}

