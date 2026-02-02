package feature.java_collection_streams.JavaGeneric;

import java.util.*;

public class Catalog {
    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<? extends Category> p : products) {
            System.out.println(p);
        }
    }
}