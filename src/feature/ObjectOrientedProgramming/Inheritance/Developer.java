package feature.ObjectOrientedProgramming.Inheritance;

public class Developer extends Employee {

    String programmingLanguage;

    public Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}
