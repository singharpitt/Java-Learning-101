// Define the public class that contains the main method

    // Define the interface named Appliance
    interface Appliance {
        void turnOn();  // Method to turn on the appliance
        void turnOff(); // Method to turn off the appliance
    }

    // Define the class named WashingMachine that implements the Appliance interface
    class WashingMachine implements Appliance {
        @Override
        public void turnOn() {
            System.out.println("Washing Machine is now ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Washing Machine is now OFF");
        }
    }
public class InterfaceDemo{
    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of WashingMachine using the Appliance interface type
        Appliance myWashingMachine = new WashingMachine();

        // Call methods defined in the Appliance interface
        myWashingMachine.turnOn();  // Calls WashingMachine's turnOn method
        myWashingMachine.turnOff(); // Calls WashingMachine's turnOff method
    }
}
