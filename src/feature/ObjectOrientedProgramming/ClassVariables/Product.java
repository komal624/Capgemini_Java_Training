
package feature.ObjectOrientedProgramming.ClassVariables;

public class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable (shared by all objects)
    static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Makes this class runnable
    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10);
        p1.displayProductDetails();

        Product p2 = new Product("Notebook", 50);
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
