package feature.ObjectOrientedProgramming.ObjectModeling;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}
