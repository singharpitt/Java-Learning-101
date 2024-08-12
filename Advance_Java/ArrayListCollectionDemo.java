package Advance_Java;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListCollectionDemo {
    public static void main(String[] args) {
        // Create an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print the ArrayList
        System.out.println("Fruits: " + fruits);

        // Create another collection
        Collection<String> moreFruits = new ArrayList<>();
        moreFruits.add("Mango");
        moreFruits.add("Pineapple");

        // Add all elements from another collection
        fruits.addAll(moreFruits);
        System.out.println("Fruits after adding moreFruits: " + fruits);

        // Check if the collection contains all elements of another collection
        boolean containsAll = fruits.containsAll(moreFruits);
        System.out.println("Fruits contains all moreFruits: " + containsAll);

        // Remove all elements from another collection
        fruits.removeAll(moreFruits);
        System.out.println("Fruits after removing moreFruits: " + fruits);

        // Retain only the elements in the collection that are contained in another collection
        fruits.addAll(moreFruits);
        Collection<String> someFruits = new ArrayList<>();
        someFruits.add("Apple");
        someFruits.add("Mango");
        fruits.retainAll(someFruits);
        System.out.println("Fruits after retaining someFruits: " + fruits);

        // Check if the collection is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is fruits empty? " + isEmpty);

        // Clear all elements from the ArrayList
        fruits.clear();
        System.out.println("Fruits after clearing: " + fruits);

        // Check if the collection is empty after clearing
        isEmpty = fruits.isEmpty();
        System.out.println("Is fruits empty after clearing? " + isEmpty);
    }
}
