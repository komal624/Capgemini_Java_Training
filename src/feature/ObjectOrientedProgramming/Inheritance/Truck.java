package feature.ObjectOrientedProgramming.Inheritance;

public class Truck extends Vehicle {

    int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity (tons): " + loadCapacity);
    }
}
