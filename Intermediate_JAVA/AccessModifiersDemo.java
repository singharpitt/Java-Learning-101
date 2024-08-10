// Define the package name at the top (if using packages)
// package myfirstpackage;

// Class to demonstrate different access modifiers
public class AccessModifiersDemo {
    public int publicVar = 10;        // Public variable
    protected int protectedVar = 20;  // Protected variable
    int defaultVar = 30;              // Default variable (no modifier)
    private int privateVar = 40;      // Private variable

    // Public method to display values
    public void display() {
        System.out.println("Access Modifiers Demo:");
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Private Variable: " + privateVar);
    }
}

class AccessModifiersTest {
    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        demo.display();

        // Accessing variables
        System.out.println("\nAccessing Variables from Main:");
        System.out.println("Public Variable: " + demo.publicVar);
        System.out.println("Protected Variable: " + demo.protectedVar);
        System.out.println("Default Variable: " + demo.defaultVar);
        // System.out.println("Private Variable: " + demo.privateVar); // Compilation error
    }
}
