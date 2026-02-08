package feature.java_collection_streams.JavaGeneric;

public class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        if (!category.isValidPrice(price)) {
            throw new IllegalArgumentException("Invalid price for " + category.getCategoryName());
        }
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPrice(double price) {
        if (!category.isValidPrice(price)) {
            throw new IllegalArgumentException("Invalid price for category");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " | " + category.getCategoryName() + " | ₹" + price;
    }
}