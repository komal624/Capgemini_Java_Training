public class VehicleRegistration {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared by all vehicles)
    static double registrationFee = 500;

    // Constructor
    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("----------------------");
    }

    // Class method
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    // Makes this class runnable
    public static void main(String[] args) {
        VehicleRegistration v1 =
                new VehicleRegistration("Komal", "Car");
        v1.displayVehicleDetails();

        // Update class variable for all vehicles
        VehicleRegistration.updateRegistrationFee(700);

        VehicleRegistration v2 =
                new VehicleRegistration("Amit", "Bike");
        v2.displayVehicleDetails();
    }
}
