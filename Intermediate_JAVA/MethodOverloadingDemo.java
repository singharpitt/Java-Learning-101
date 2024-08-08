package Intermediate_JAVA;

class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        // Create an object of Calculator class
        Calculator calc = new Calculator();

        // Use the add method with different parameter lists
        int sum1 = calc.add(5, 10); // Calls the add(int, int) method
        int sum2 = calc.add(1, 2, 3); // Calls the add(int, int, int) method
        double sum3 = calc.add(2.5, 3.5); // Calls the add(double, double) method

        // Display the results
        System.out.println("Sum of 5 and 10: " + sum1);
        System.out.println("Sum of 1, 2, and 3: " + sum2);
        System.out.println("Sum of 2.5 and 3.5: " + sum3);
    }
}
