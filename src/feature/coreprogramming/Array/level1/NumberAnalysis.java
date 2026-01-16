import java.util.Scanner;

// Program to print multiplication table using array
class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create array to store multiplication results
        int[] table = new int[10];

        // Store results
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display results
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}
