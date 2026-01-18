package CoreProgramming.JavaStrings;

/**
 * This program demonstrates NullPointerException
 * and shows how to handle it using try-catch.
 */
public class NullPointerDemo {

    /**
     * Method to generate NullPointerException
     */
    public static void generateException() {

        // Initialize string as null
        String text = null;

        // This will cause NullPointerException
        System.out.println(text.length());
    }

    /**
     * Method to handle NullPointerException
     */
    public static void handleException() {

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Uncomment to see program crash
        // generateException();

        // Safe execution
        handleException();
    }
}
