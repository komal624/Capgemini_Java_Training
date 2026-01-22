package feature.ObjectOrientedProgramming.Constructors;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double COST_PER_DAY = 1000;

    // Default constructor
    public CarRental() {
        this("Customer", "Hatchback", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * COST_PER_DAY;
    }

    // Makes this class runnable
    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        System.out.println("Total Cost (Default): " + c1.calculateCost());

        CarRental c2 = new CarRental("Komal", "SUV", 4);
        System.out.println("Total Cost (Custom): " + c2.calculateCost());
    }
}

