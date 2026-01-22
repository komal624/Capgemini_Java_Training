package feature.ObjectOrientedProgramming.EncapsulationPolymorphism;

import java.util.ArrayList;

public class ECommerceSystem {

    public static void main(String[] args) {

        ArrayList<Product> cart = new ArrayList<>();

        Product p1 = new Electronics(101, "Laptop", 50000);
        Product p2 = new Clothing(102, "T-Shirt", 1000);

        cart.add(p1);
        cart.add(p2);

        // Polymorphism
        for (Product p : cart) {
            p.displayDetails();
        }
    }
}

