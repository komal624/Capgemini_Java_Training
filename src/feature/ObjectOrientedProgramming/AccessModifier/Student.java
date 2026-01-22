package feature.ObjectOrientedProgramming.AccessModifiers;

public class Student {

    // Access modifiers
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public methods to access private CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    // Runnable
    public static void main(String[] args) {
        Student s1 = new Student(101, "Komal", 8.5);
        System.out.println("Roll: " + s1.rollNumber);
        System.out.println("Name: " + s1.name);
        System.out.println("CGPA: " + s1.getCGPA());

        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
    }
}
