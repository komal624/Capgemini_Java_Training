package feature.ObjectOrientedProgramming.EncapsulationPolymorphism;

public class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.18; // 18% GST
    }

    @Override
    public double getFinalPrice() {
        return price + calculateTax();
    }
}

