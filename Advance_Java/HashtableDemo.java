package Advance_Java;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        // Create a Hashtable of String keys and Integer values
        Hashtable<String, Integer> scores = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        scores.put("John", 90);
        scores.put("Jane", 85);
        scores.put("Jake", 95);

        // Print the Hashtable
        System.out.println("Scores Hashtable: " + scores);

        // Access a value from the Hashtable
        int scoreOfJane = scores.get("Jane");
        System.out.println("Score of Jane: " + scoreOfJane);

        // Check if the Hashtable contains a specific key
        boolean hasJohn = scores.containsKey("John");
        System.out.println("Contains John: " + hasJohn);

        // Remove a key-value pair from the Hashtable
        scores.remove("Jake");
        System.out.println("Hashtable after removing Jake: " + scores);

        // Iterate over the Hashtable
        System.out.println("Iterating over the Hashtable:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

