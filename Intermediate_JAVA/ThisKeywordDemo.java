public class ThisKeywordDemo {

    // Instance variables
    private String name;
    private int age;

    // Constructor using the this keyword to differentiate instance variables from parameters
    public ThisKeywordDemo(String name, int age) {
        this.name = name; // Assigns the parameter 'name' to the instance variable 'name'
        this.age = age;   // Assigns the parameter 'age' to the instance variable 'age'
    }

    // Method to set name using this keyword
    public void setName(String name) {
        this.name = name; // Uses this to refer to the instance variable 'name'
    }

    // Method to set age using this keyword
    public void setAge(int age) {
        this.age = age;   // Uses this to refer to the instance variable 'age'
    }

    // Method to return the current object using this
    public ThisKeywordDemo getThis() {
        return this; // Returns the current instance of the class
    }

    // Method to display details of the current instance
    public void display() {
        System.out.println("Name: " + this.name); // Using this is optional here
        System.out.println("Age: " + this.age);   // Using this is optional here
    }

    public static void main(String[] args) {
        // Create an instance of ThisKeywordDemo
        ThisKeywordDemo person = new ThisKeywordDemo("Alice", 25);

        // Display the initial details
        person.display(); // Output: Name: Alice, Age: 25

        // Change the name and age using methods
        person.setName("Bob");
        person.setAge(30);

        // Display the updated details
        person.display(); // Output: Name: Bob, Age: 30

        // Demonstrate returning the current object
        ThisKeywordDemo currentInstance = person.getThis();

        // Check if the returned object is the same as the current instance
        System.out.println("Is currentInstance same as person? " + (currentInstance == person)); // Output: true
    }
}
