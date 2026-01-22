package feature.ObjectOrientedProgramming.ObjectModeling;

import java.util.ArrayList;

public class Company {

    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.display();
        }
        System.out.println("----------------------");
    }

    // Simulating delete (composition)
    void deleteCompany() {
        departments.clear();
        System.out.println("Company deleted. All departments and employees removed.");
    }

    // Runnable
    public static void main(String[] args) {

        Company company = new Company("Tech Corp");

        Department d1 = new Department("IT");
        d1.addEmployee("Komal");
        d1.addEmployee("Amit");

        Department d2 = new Department("HR");
        d2.addEmployee("Riya");

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.displayCompany();

        // Composition effect
        company.deleteCompany();
    }
}
