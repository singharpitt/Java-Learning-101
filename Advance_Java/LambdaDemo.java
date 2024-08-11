package Advance_Java;
// Define a functional interface
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
public class LambdaDemo {

    public static void main(String[] args) {
        // Implement the MathOperation interface using a lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Implement the MathOperation interface using a lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Use the functional interface
        int sum = addition.operate(10, 5);
        int difference = subtraction.operate(10, 5);

        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        // Call default method
        addition.printMessage();

        // Call static method
        MathOperation.printStaticMessage();
    }
}

