package feature.ObjectOrientedProgramming.EncapsulationPolymorphism;

public class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.05; // 5% tax
    }

    @Override
    public double getFinalPrice() {
        return price + calculateTax();
    }
}
