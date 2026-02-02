package feature.java_collection_streams.JavaGeneric;

public class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }

    public boolean isValidPrice(double price) {
        return price >= 100 && price <= 2000;
    }
}
