class Circle {
    double radius;

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;

        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
