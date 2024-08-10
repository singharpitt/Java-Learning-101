class Printer {
    // Method to print a message
    public void printMessage(String message) {
        System.out.println(message);
    }
}

public class AnonymousObjectDemo {
    public static void main(String[] args) {
        // Creating an anonymous object to call printMessage method
        new Printer().printMessage("Hello, world!");

        // Using an anonymous object for a one-time calculation
        int result = new Calculator().add(5, 10);
        System.out.println("Result of addition: " + result);
        
        // Using anonymous objects in chaining calls
        new Printer().printMessage("This is a second message using an anonymous object.");
    }
}

class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
}
