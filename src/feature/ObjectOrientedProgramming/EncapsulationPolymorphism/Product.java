
package feature.ObjectOrientedProgramming.EncapsulationPolymorphism;

public abstract class Product {

    // Encapsulation
    private int productId;
    private String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    public abstract double getFinalPrice();

    // Common display
    public void displayDetails() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Final Price: " + getFinalPrice());
        System.out.println("----------------------");
    }
}
