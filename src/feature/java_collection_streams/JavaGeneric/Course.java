package feature.java_collection_streams.JavaGeneric;

public class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public void displayCourse() {
        System.out.println(courseName + " | " + courseType.getEvaluationMethod());
    }
}