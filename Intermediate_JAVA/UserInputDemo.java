

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);
        // Note that the object name scanner can be changed to whatever you like it can be anything
        // Taking an integer input
        System.out.print("Enter an integer: ");
        int integerValue = scanner.nextInt();
        
        // Taking a double input
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Clear the scanner buffer
        scanner.nextLine(); // To consume the newline character after double input

        // Taking a string input
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        // Taking a boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        // Display the entered values
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + integerValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("String: " + stringValue);
        System.out.println("Boolean: " + booleanValue);

        // Note: Not closing the scanner to avoid closing System.in
    }
}

