package feature.ObjectOrientedProgramming.ObjectModeling;

import java.util.ArrayList;

public class Department {

    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void display() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}
