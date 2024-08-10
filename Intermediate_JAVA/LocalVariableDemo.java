
class CalculatorDemo {
    // Method to add two numbers
    public int add(int a, int b) {
        // Local variable 'sum'
        int sum = a + b;
        return sum;
    }
}

public class LocalVariableDemo {
    public static void main(String[] args) {
        CalculatorDemo calculator = new CalculatorDemo();
        int result = calculator.add(5, 3);
        
        // Accessing the local variable 'result'
        System.out.println("Sum: " + result); // Output: Sum: 8
    }
}

