public class SimpleAddition {

    // Function to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Example numbers to add
        int number1 = 5;
        int number2 = 10;

        // Call the function and store the result
        int result = addNumbers(number1, number2);

        // Print the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}
