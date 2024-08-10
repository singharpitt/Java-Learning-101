public class ArrayDemo {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print elements in the array using a traditional for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element in the array
        numbers[2] = 10;

        // Print modified array using a traditional for loop
        System.out.println("Modified array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Create an array of strings and initialize it
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        // Print all elements in the string array using a traditional for loop
        System.out.println("Fruits array elements:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Element at index " + i + ": " + fruits[i]);
        }
    }
}

