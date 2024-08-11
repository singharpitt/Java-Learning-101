package Advance_Java;

// Define the enum named Fruit with package-private access
enum Fruit {
    APPLE("Red or Green", "Sweet or Tart"), 
    BANANA("Yellow", "Sweet"), 
    ORANGE("Orange", "Citrus"), 
    STRAWBERRY("Red", "Sweet"), 
    BLUEBERRY("Blue", "Sweet"), 
    GRAPE("Purple or Green", "Sweet"), 
    LEMON("Yellow", "Sour");

    // Fields to store the color and taste of the fruit
    private final String color;
    private final String taste;

    // Constructor to initialize the fields
    private Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    // Method to get the color of the fruit
    public String getColor() {
        return color;
    }

    // Method to get the taste of the fruit
    public String getTaste() {
        return taste;
    }

    // Method to print a message about the fruit
    public void printMessage() {
        System.out.println(this + " is " + color + " and tastes " + taste + ".");
    }
}

// Define the public class that contains the main method
public class EnumDemo01 {

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a variable of type Fruit
        Fruit favoriteFruit = Fruit.APPLE;

        // Print the characteristics of the favorite fruit
        System.out.println("Favorite fruit details:");
        System.out.println("Color: " + favoriteFruit.getColor());
        System.out.println("Taste: " + favoriteFruit.getTaste());

        // Print a message about the favorite fruit
        favoriteFruit.printMessage();

        // Iterate over all fruits and print their characteristics
        System.out.println("\nAll fruits and their characteristics:");
        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit + ":");
            fruit.printMessage();
        }
    }
}
