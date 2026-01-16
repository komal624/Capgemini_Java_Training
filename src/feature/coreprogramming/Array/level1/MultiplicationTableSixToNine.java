import java.util.Scanner;

// Program to print multiplication table from 6 to 9
class MultiplicationTableSixToNine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create array for results
        int[] results = new int[4];

        int index = 0;

        // Store results from 6 to 9
        for (int i = 6; i <= 9; i++) {
            results[index] = number * i;
            index++;
        }

        // Display results
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + results[index]);
            index++;
        }

        input.close();
    }
}
