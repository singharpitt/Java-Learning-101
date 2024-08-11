package Advance_Java;

// Define the public class that contains the main method
public class ErrorHandlingDemo1 {

    // Method that intentionally generates a StackOverflowError
    public static void generateError() {
        generateError(); // Recursive call without base case leads to a stack overflow
    }

    // Main method to execute the program
    public static void main(String[] args) {
        try {
            // Attempt to generate a StackOverflowError
            generateError();
        } catch (StackOverflowError e) {
            // Handle the StackOverflowError
            System.out.println("Error: Stack overflow detected!");

            // Optionally, perform recovery steps or logging here
        } finally {
            // This block will always execute
            System.out.println("Execution of the try-catch block completed.");
        }

        System.out.println("Program continues...");
    }
}
