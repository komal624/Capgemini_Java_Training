package feature.java_collection_streams.Exceptions;

public class NestedTryCatchApp {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            int index = 2;
            int divisor = 0;

            try {
                int result = arr[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}