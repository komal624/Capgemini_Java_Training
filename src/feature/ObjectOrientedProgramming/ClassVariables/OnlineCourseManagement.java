public class OnlineCourseManagement {

    // Instance variables
    String courseName;
    int duration;   // in weeks
    double fee;

    // Class variable (shared by all courses)
    static String instituteName = "SRM Institute";

    // Constructor
    public OnlineCourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("----------------------");
    }

    // Class method
    static void updateInstituteName(String name) {
        instituteName = name;
    }

    // Makes this class runnable
    public static void main(String[] args) {
        OnlineCourseManagement c1 =
                new OnlineCourseManagement("Java", 8, 5000);
        c1.displayCourseDetails();

        // Change institute name for ALL courses
        OnlineCourseManagement.updateInstituteName("Tech Academy");

        OnlineCourseManagement c2 =
                new OnlineCourseManagement("Python", 6, 4000);
        c2.displayCourseDetails();
    }
}
