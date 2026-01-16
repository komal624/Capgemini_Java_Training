class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.brand = "Samsung";
        m.model = "S21";
        m.price = 55000;

        m.displayDetails();
    }
}
