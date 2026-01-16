import java.util.Scanner;

// Program to find youngest and tallest among 3 friends
class YoungestAndTallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Arrays for age and height
        int[] age = new int[3];
        double[] height = new double[3];

        // Take input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            age[i] = input.nextInt();

            System.out.print("Enter height of friend " + (i + 1) + ": ");
            height[i] = input.nextDouble();
        }

        int youngest = age[0];
        double tallest = height[0];

        // Find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < youngest) {
                youngest = age[i];
            }
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }

        // Display results
        System.out.println("Youngest age is: " + youngest);
        System.out.println("Tallest height is: " + tallest);

        input.close();
    }
}
