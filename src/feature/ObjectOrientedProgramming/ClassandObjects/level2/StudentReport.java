class Student {
    int rollNumber;
    String name;
    int marks1;
    int marks2;
    int marks3;

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    void displayResult() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.rollNumber = 1;
        s.name = "Komal";
        s.marks1 = 80;
        s.marks2 = 75;
        s.marks3 = 90;

        s.displayResult();
    }
}
