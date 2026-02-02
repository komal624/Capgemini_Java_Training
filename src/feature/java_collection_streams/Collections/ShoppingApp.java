package feature.java_collection_streams.Collections;


public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);
        cart.addItem("Mouse", 500);
        cart.addItem("Keyboard", 1500);

        cart.displayCartOrder();
        System.out.println();
        cart.displaySortedByPrice();
    }
}
