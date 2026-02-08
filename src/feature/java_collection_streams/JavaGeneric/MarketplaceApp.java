package feature.java_collection_streams.JavaGeneric;

public class MarketplaceApp {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Product<BookCategory> book =
                new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1000, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 20000, new GadgetCategory());

        DiscountUtil.applyDiscount(book, 10);

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        catalog.showCatalog();
    }
}
