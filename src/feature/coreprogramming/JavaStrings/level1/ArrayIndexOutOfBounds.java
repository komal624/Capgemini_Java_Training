package CoreProgramming.JavaStrings;

import java.util.Scanner;

/**
 * This program shows what happens when we try to access
 * an array index that is outside the valid range.
 * It also demonstrates how to handle the error safely.
 */
public class ArrayIndexOutOfBounds {

    // Method to generate the exception
    public static void generate(String[] names, int index) {
        // This will crash if index is greater than array length - 1
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    // Method to handle the exception
    public static void handle(String[] names, int index) {
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Array size is " + names.length);
        } catch (RuntimeException e) {
            System.out.println("Runtime exception occurred.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of names
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create array
        String[] names = new String[size];

        // Take names input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Take index to access
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        // Uncomment to see crash
        // generate(names, index);

        // Safe run
        handle(names, index);

        sc.close();
    }
}
