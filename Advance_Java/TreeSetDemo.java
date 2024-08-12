package Advance_Java;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet of String type
        TreeSet<String> cities = new TreeSet<>();

        // Add elements to the TreeSet
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("San Francisco");

        // Print the TreeSet (in sorted order)
        System.out.println("Cities TreeSet: " + cities);

        // Check if the TreeSet contains a specific element
        boolean hasChicago = cities.contains("Chicago");
        System.out.println("Contains Chicago: " + hasChicago);

        // Remove an element from the TreeSet
        cities.remove("Los Angeles");
        System.out.println("TreeSet after removing Los Angeles: " + cities);

        // Iterate over the TreeSet
        System.out.println("Iterating over the TreeSet:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

