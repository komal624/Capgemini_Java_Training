package feature.java_collection_streams.JavaGeneric;

public class UniversityApp {
    public static void main(String[] args) {
        Course<ExamCourse> math =
                new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> java =
                new Course<>("Java Programming", new AssignmentCourse());

        Course<ResearchCourse> ai =
                new Course<>("AI Research", new ResearchCourse());

        math.displayCourse();
        java.displayCourse();
        ai.displayCourse();
    }
}