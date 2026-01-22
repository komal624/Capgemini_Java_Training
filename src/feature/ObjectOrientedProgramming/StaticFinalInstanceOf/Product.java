package feature.ObjectOrientedProgramming.StaticFinalInstanceOf;

public class Product {

    // Static (shared discount for all products)
    static double discount = 10.0; // percentage

    // Final (unique, cannot be changed)
    final int productID;

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Constructor using this
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("----------------------");
    }

    // Runnable + instanceof demo
    public static void main(String[] args) {

        Object obj = new Product("Laptop", 50000, 1, 101);

        if (obj instanceof Product) {
            Product p1 = (Product) obj;
            p1.displayDetails();
        }

        // Update discount for all products
        Product.updateDiscount(15.0);

        Product p2 = new Product("Mouse", 500, 2, 102);
        p2.displayDetails();
    }
}
