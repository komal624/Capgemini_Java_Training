package feature.java_collection_streams.JavaGeneric;



public class ClothingCategory implements Category {

    @Override
    public String getCategoryName() {
        return "Clothing";
    }

    @Override
    public boolean isValidPrice(double price) {
        return price >= 300 && price <= 5000;
    }
}
