package Advance_Java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Create a Consumer to perform an action on each number
        Consumer<Integer> action = number -> System.out.println("Number: " + number);

        // Use forEach with a Consumer
        System.out.println("Numbers list:");
        numbers.forEach(action);
    }
}

