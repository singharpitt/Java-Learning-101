package Advance_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        // Create a List of String type
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        // Get an Iterator for the List
        Iterator<String> iterator = animals.iterator();

        // Iterate over the List using the Iterator
        System.out.println("Iterating over the List:");
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }

        // Use Iterator to remove an element
        iterator = animals.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            if (animal.equals("Cat")) {
                iterator.remove();
            }
        }

        System.out.println("List after removing Cat: " + animals);
    }
}

