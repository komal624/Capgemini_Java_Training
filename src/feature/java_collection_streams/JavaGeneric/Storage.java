package feature.java_collection_streams.JavaGenric;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.getCategory() + " -> " + item.getName());
        }
    }
}