public class SimpleEncapsulation {

    // Private fields: Encapsulated within the class
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String newName) {
        name = newName;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int newAge) {
        if (newAge >= 0) { // Validate that age is non-negative
            age = newAge;
        } else {
            System.out.println("Age cannot be negative. Please enter a valid age.");
        }
    }

    // Method to display the details of the person
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args) {
        // Create an instance of SimpleEncapsulation
        SimpleEncapsulation person = new SimpleEncapsulation();

        // Set the name and age using setter methods
        person.setName("Alice");
        person.setAge(25);

        // Display the details
        person.display(); // Output: Name: Alice, Age: 25

        // Modify the name and age
        person.setName("Bob");
        person.setAge(30);

        // Display the updated details
        person.display(); // Output: Name: Bob, Age: 30

        // Attempt to set an invalid age
        person.setAge(-5); // Output: Age cannot be negative. Please enter a valid age.

        // Display the details to confirm age wasn't changed
        person.display(); // Output: Name: Bob, Age: 30
    }
}
