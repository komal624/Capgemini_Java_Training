package feature.java_collection_streams.JavaGenric;

public class WarehouseDemo {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage.displayAll(electronicsStorage.getItems());
    }
}
