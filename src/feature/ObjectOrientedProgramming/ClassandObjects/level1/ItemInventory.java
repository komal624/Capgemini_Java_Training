class Item {
    int itemCode;
    String itemName;
    double price;

    double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 201;
        i.itemName = "Pen";
        i.price = 10;

        System.out.println("Total Cost: " + i.totalCost(5));
    }
}
