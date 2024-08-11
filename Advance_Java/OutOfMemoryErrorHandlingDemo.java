package Advance_Java;

// Define the public class that contains the main method
public class OutOfMemoryErrorHandlingDemo {

    // Method that intentionally generates an OutOfMemoryError
    public static void generateOutOfMemoryError() {
        // Attempt to create a large number of objects
        int[][] largeArray = new int[Integer.MAX_VALUE][Integer.MAX_VALUE];
    }

    // Main method to execute the program
    public static void main(String[] args) {
        try {
            // Attempt to generate an OutOfMemoryError
            generateOutOfMemoryError();
        } catch (OutOfMemoryError e) {
            // Handle the OutOfMemoryError
            System.out.println("Error: Out of memory!");

            // Perform recovery steps or logging here
        } finally {
            // This block will always execute
            System.out.println("Execution of the try-catch block completed.");
        }

        System.out.println("Program continues...");
    }
}
