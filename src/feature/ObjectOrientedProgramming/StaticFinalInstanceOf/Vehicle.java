package feature.ObjectOrientedProgramming.StaticFinalInstanceOf;

public class Vehicle {

    // Static (shared by all vehicles)
    static double registrationFee = 500;

    // Final (unique, cannot be changed)
    final String registrationNumber;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Constructor using this
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("----------------------");
    }

    // Runnable + instanceof demo
    public static void main(String[] args) {

        Object obj = new Vehicle("Komal", "Car", "TN01AB1234");

        if (obj instanceof Vehicle) {
            Vehicle v1 = (Vehicle) obj;
            v1.displayDetails();
        }

        // Update fee for all vehicles
        Vehicle.updateRegistrationFee(700);

        Vehicle v2 = new Vehicle("Amit", "Bike", "TN02XY5678");
        v2.displayDetails();
    }
}
