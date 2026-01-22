package feature.ObjectOrientedProgramming.Constructors;

public class Circle {
    double radius;

    public Circle() {
        this(1.0);   // default constructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }


    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();

        Circle c2 = new Circle(5.0);
        c2.display();
    }
}
