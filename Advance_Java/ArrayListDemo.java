package Advance_Java;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print the ArrayList
        System.out.println("Fruits: " + fruits);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // Access an element from the ArrayList
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Modify an element in the ArrayList
        fruits.set(1, "Mango");
        System.out.println("Modified Fruits: " + fruits);

        // Remove an element from the ArrayList
        fruits.remove("Orange");
        System.out.println("Fruits after removal: " + fruits);

        // Iterate over the elements in the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if the ArrayList contains a specific element
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains Apple: " + hasApple);

        // Clear all elements from the ArrayList
        fruits.clear();
        System.out.println("Fruits after clearing: " + fruits);
    }
}
