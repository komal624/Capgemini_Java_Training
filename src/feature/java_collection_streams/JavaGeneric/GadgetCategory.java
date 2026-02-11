package feature.java_collection_streams.JavaGeneric;


public class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }

    public boolean isValidPrice(double price) {
        return price >= 1000 && price <= 100000;
    }
}
