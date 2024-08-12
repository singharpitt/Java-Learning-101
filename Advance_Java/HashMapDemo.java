package Advance_Java;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap of String keys and Integer values
        HashMap<String, Integer> ages = new HashMap<>();

        // Add key-value pairs to the HashMap
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        // Print the HashMap
        System.out.println("Ages HashMap: " + ages);

        // Access a value from the HashMap
        int ageOfAlice = ages.get("Alice");
        System.out.println("Age of Alice: " + ageOfAlice);

        // Check if the HashMap contains a specific key
        boolean hasBob = ages.containsKey("Bob");
        System.out.println("Contains Bob: " + hasBob);

        // Remove a key-value pair from the HashMap
        ages.remove("Charlie");
        System.out.println("HashMap after removing Charlie: " + ages);

        // Iterate over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

