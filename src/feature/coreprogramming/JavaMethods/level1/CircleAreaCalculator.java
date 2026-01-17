import java.util.Scanner;

class CircleAreaCalculator {

    // Method to calculate area
    static double calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        // Validate input
        if (radius <= 0) {
            System.out.println("Invalid radius. Must be positive.");
            System.exit(0);
        }

        // Call method
        double area = calculateArea(radius);

        // Display result
        System.out.println("Area of Circle is: " + area);

        input.close();
    }
}
