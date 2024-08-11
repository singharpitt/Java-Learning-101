package Advance_Java;

// Define a custom exception class
class CustomException extends Exception {
    // Constructor with a custom error message
    public CustomException(String message) {
        super(message);
    }
}

// Define the public class that contains the main method
public class ThrowDemo {

    // Method that checks if a number is positive and throws a CustomException if it is not
    public static void checkPositive(int number) throws CustomException {
        if (number < 0) {
            // Throw a custom exception with a message
            throw new CustomException("Number is negative: " + number);
        } else {
            System.out.println("Number is positive: " + number);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        try {
            // Test the checkPositive method with a negative number
            checkPositive(-5);
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            // Test the checkPositive method with a positive number
            checkPositive(10);
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
