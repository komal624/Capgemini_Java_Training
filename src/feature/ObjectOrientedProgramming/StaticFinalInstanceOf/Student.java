package feature.ObjectOrientedProgramming.StaticFinalInstanceOf;

public class Student {

    // Static (shared by all students)
    static String universityName = "SRM University";
    static int totalStudents = 0;

    // Final (cannot be changed)
    final int rollNumber;

    // Instance variables
    String name;
    String grade;

    // Constructor using this
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }

    // Runnable + instanceof demo
    public static void main(String[] args) {

        Object obj = new Student("Komal", 101, "A");

        if (obj instanceof Student) {
            Student s1 = (Student) obj;
            s1.displayDetails();
        }

        Student s2 = new Student("Amit", 102, "B");
        s2.displayDetails();

        Student.displayTotalStudents();
    }
}
