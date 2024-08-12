package Advance_Java;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet of Integer type
        HashSet<Integer> numbers = new HashSet<>();

        // Add elements to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate element, will not be added

        // Print the HashSet
        System.out.println("Numbers HashSet: " + numbers);

        // Check if the HashSet contains a specific element
        boolean hasTwenty = numbers.contains(20);
        System.out.println("Contains 20: " + hasTwenty);

        // Remove an element from the HashSet
        numbers.remove(10);
        System.out.println("HashSet after removing 10: " + numbers);

        // Iterate over the HashSet
        System.out.println("Iterating over the HashSet:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

