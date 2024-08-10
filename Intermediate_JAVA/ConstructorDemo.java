

public class ConstructorDemo {
    // Instance variables
    private String name;
    private int age;
    
    // Default constructor
    public ConstructorDemo() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called");
    }
    
    // Parameterized constructor
    public ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }
    
    // Method to display the person's details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Using the default constructor
        ConstructorDemo person1 = new ConstructorDemo();
        person1.display(); // Output: Name: Unknown, Age: 0

        // Using the parameterized constructor
        ConstructorDemo person2 = new ConstructorDemo("Alice", 30);
        person2.display(); // Output: Name: Alice, Age: 30

        // Using the parameterized constructor with different values
        ConstructorDemo person3 = new ConstructorDemo("Bob", 25);
        person3.display(); // Output: Name: Bob, Age: 25
    }
}
