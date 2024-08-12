package Advance_Java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamApiDemo {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use filter to get even numbers
        System.out.println("Even numbers:");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        // Use map to square each number
        System.out.println("Squared numbers:");
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);

        // Use reduce to find the sum of all numbers
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        
        System.out.println("Sum of all numbers: " + sum.orElse(0));
    }
}

