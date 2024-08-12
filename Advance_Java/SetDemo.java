package Advance_Java;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // Create a Set of String type
        Set<String> colors = new HashSet<>();

        // Add elements to the Set
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate element, will not be added

        // Print the Set
        System.out.println("Colors Set: " + colors);

        // Check if the Set contains a specific element
        boolean hasBlue = colors.contains("Blue");
        System.out.println("Contains Blue: " + hasBlue);

        // Remove an element from the Set
        colors.remove("Green");
        System.out.println("Set after removing Green: " + colors);

        // Iterate over the Set
        System.out.println("Iterating over the Set:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
