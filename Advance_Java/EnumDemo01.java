package Advance_Java;

// Define the enum named Day with package-private access
enum Day {
    SUNDAY("Weekend"), 
    MONDAY("Weekday"), 
    TUESDAY("Weekday"), 
    WEDNESDAY("Weekday"), 
    THURSDAY("Weekday"), 
    FRIDAY("Weekday"), 
    SATURDAY("Weekend");

    // Field to store the type of the day
    private final String type;

    // Constructor to initialize the type field
    private Day(String type) {
        this.type = type;
    }

    // Method to get the type of the day
    public String getType() {
        return type;
    }

    // Method to print a message based on the day type
    public void printMessage() {
        if (this.type.equals("Weekend")) {
            System.out.println(this + " is a weekend!");
        } else {
            System.out.println(this + " is a weekday.");
        }
    }
}

// Define the public class that contains the main method
public class EnumDemo01 {

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a variable of type Day
        Day today = Day.MONDAY;

        // Print the type of today
        System.out.println("Today is a: " + today.getType());

        // Print a message based on the day type
        today.printMessage();

        // Iterate over all days and print their types and messages
        System.out.println("\nAll days and their types:");
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getType());
            day.printMessage();
        }
    }
}
