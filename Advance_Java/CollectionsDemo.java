package Advance_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Integer type
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        Collections.addAll(numbers, 5, 3, 8, 1, 9, 2, 7);

        // Print the original ArrayList
        System.out.println("Original List: " + numbers);

        // Sort the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Reverse the ArrayList
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // Shuffle the ArrayList
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        // Find the maximum element
        int maxElement = Collections.max(numbers);
        System.out.println("Max Element: " + maxElement);

        // Find the minimum element
        int minElement = Collections.min(numbers);
        System.out.println("Min Element: " + minElement);

        // Count the frequency of an element
        int frequencyOfThree = Collections.frequency(numbers, 3);
        System.out.println("Frequency of 3: " + frequencyOfThree);

        // Replace all occurrences of a specified value
        Collections.replaceAll(numbers, 3, 10);
        System.out.println("List after replacing 3 with 10: " + numbers);

        // Binary search for an element (list must be sorted first)
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 7);
        System.out.println("Index of element 7: " + index);
    }
}

