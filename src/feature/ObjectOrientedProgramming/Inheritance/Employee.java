package feature.ObjectOrientedProgramming.Inheritance;

public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    // Runnable
    public static void main(String[] args) {

        Employee e1 = new Manager("Komal", 101, 50000, 5);
        Employee e2 = new Developer("Amit", 102, 40000, "Java");
        Employee e3 = new Intern("Riya", 103, 15000, 6);

        e1.displayDetails();
        System.out.println("------------------");
        e2.displayDetails();
        System.out.println("------------------");
        e3.displayDetails();
    }
}

