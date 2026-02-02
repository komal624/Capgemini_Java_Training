package feature.java_collection_streams.Collections;


import java.util.*;

public class ShoppingCart {

    private HashMap<String, Double> priceMap = new HashMap<>();
    private LinkedHashMap<String, Double> cartOrder = new LinkedHashMap<>();

    public void addItem(String product, double price) {
        priceMap.put(product, price);
        cartOrder.put(product, price);
    }

    public void displayCartOrder() {
        System.out.println("Cart Order:");
        for (String p : cartOrder.keySet()) {
            System.out.println(p + " -> ₹" + cartOrder.get(p));
        }
    }

    public void displaySortedByPrice() {
        TreeMap<Double, String> sorted = new TreeMap<>();
        for (String p : priceMap.keySet()) {
            sorted.put(priceMap.get(p), p);
        }

        System.out.println("Sorted By Price:");
        for (Double price : sorted.keySet()) {
            System.out.println(sorted.get(price) + " -> ₹" + price);
        }
    }
}

