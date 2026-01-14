package feature.coreprogramming.programmingelements.level1;


public class AgeFinder {

    public static void main(String[] args) {

        // Declare variables
        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        // Calculate age
        int age = currentYear - birthYear;

        // Display result
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}
