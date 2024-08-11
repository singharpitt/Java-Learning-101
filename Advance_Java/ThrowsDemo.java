package Advance_Java;

// Define a custom exception class
class InvalidAgeException extends Exception {
    // Constructor with a custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Define the public class that contains the main method
public class ThrowsDemo {

    // Method that checks age and throws an InvalidAgeException if age is less than 18
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throw a custom exception with a message
            throw new InvalidAgeException("Age must be 18 or older. Provided age: " + age);
        } else {
            System.out.println("Access granted. Age: " + age);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        try {
            // Test the checkAge method with an invalid age
            checkAge(16);
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            // Test the checkAge method with a valid age
            checkAge(20);
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
