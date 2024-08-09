package Intermediate_JAVA;

public class ForEachExample {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Initialize a variable to store the sum of numbers
        int sum = 0;

        // Use a for-each loop to iterate over the array
        for (int number : numbers) {
            sum += number; // Add each number to the sum
        }

        // Print the sum of the numbers
        System.out.println("Sum of numbers: " + sum);
    }
}

