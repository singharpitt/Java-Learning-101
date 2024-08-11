package Advance_Java;

// Define the functional interface
@FunctionalInterface
interface MathOperation {
    // Single abstract method
    int operate(int a, int b);

    // Default method
    default void printMessage() {
        System.out.println("Performing operation...");
    }

    // Static method
    static void printStaticMessage() {
        System.out.println("This is a static method.");
    }
}

// Define the public class that contains the main method
public class FunctionalInterfaceDemo {

    // Main method to execute the program
    public static void main(String[] args) {
        // Implement the MathOperation interface using a lambda expression
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;

        // Use the functional interface
        int sum = addition.operate(5, 3);
        int difference = subtraction.operate(5, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        // Call default method
        addition.printMessage();

        // Call static method
        MathOperation.printStaticMessage();
    }
}

