package Advance_Java;

// Define the enum named Day
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumDemo {

    public static void main(String[] args) {
        // Create a variable of type Day
        Day today = Day.MONDAY;

        // Print the value of today
        System.out.println("Today is: " + today);

        // Use a switch statement with the enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Just another day.");
                break;
        }

        // Print all days of the week using values() method
        System.out.println("\nAll days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // Print the ordinal value of a specific day
        System.out.println("\nOrdinal value of " + today + ": " + today.ordinal());
    }
}
