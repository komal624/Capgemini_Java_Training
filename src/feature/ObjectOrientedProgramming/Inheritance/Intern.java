package feature.ObjectOrientedProgramming.Inheritance;

public class Intern extends Employee {

    int internshipMonths;

    public Intern(String name, int id, double salary, int months) {
        super(name, id, salary);
        this.internshipMonths = months;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipMonths + " months");
    }
}

