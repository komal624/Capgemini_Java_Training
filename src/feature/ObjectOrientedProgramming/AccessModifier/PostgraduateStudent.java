package feature.ObjectOrientedProgramming.AccessModifiers;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent(int roll, String name, double cgpa) {
        super(roll, name, cgpa);
    }

    // Runnable
    public static void main(String[] args) {
        PostgraduateStudent p1 =
                new PostgraduateStudent(201, "Amit", 8.8);

        // Accessing public and protected members
        System.out.println("Roll: " + p1.rollNumber);
        System.out.println("Name: " + p1.name);
        System.out.println("CGPA: " + p1.getCGPA());
    }
}
