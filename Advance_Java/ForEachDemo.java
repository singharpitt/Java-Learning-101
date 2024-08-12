package Advance_Java;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        // Create a list of fruits
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");

        // Use forEach with a lambda expression to print each fruit
        System.out.println("Fruits list:");
        fruits.forEach(fruit -> System.out.println(fruit));

        // Use forEach with method reference
        System.out.println("Fruits list (using method reference):");
        fruits.forEach(System.out::println);
    }
}

