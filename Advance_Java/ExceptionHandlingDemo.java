package Advance_Java;

// Define the public class that contains the main method
public class ExceptionHandlingDemo {

    // Method that performs division and throws an ArithmeticException if the divisor is zero
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle the ArithmeticException
            System.out.println("Error: Cannot divide by zero.");

        } finally {
            // Code in finally block will always execute
            System.out.println("Execution of the try-catch block completed.");
        }

        System.out.println("Program continues...");
    }
}

