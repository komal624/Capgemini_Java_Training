package feature.ObjectOrientedProgramming.StaticFinalInstanceOf;

public class Patient {

    // Static (shared among all patients)
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    // Final (unique, cannot be changed)
    final int patientID;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Constructor using this
    public Patient(String name, int patientID, int age, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Name: " + name);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("----------------------");
    }

    // Runnable + instanceof demo
    public static void main(String[] args) {

        Object obj = new Patient("Komal", 1, 22, "Fever");

        if (obj instanceof Patient) {
            Patient p1 = (Patient) obj;
            p1.displayDetails();
        }

        Patient p2 = new Patient("Amit", 2, 30, "Cold");
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}
