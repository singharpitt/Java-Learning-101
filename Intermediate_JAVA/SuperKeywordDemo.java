// Parent class: Animal
class Animal {
    // Field in the parent class
    protected String name;

    // Constructor of the parent class
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
    }

    // Method in the parent class
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class: Dog
class Dog extends Animal {

    // Constructor of the child class
    public Dog(String name) {
        super(name); // Calls the constructor of the parent class
        System.out.println("Dog constructor called for: " + name);
    }

    // Overriding method in the child class
    @Override
    public void makeSound() {
        super.makeSound(); // Calls the parent class method
        System.out.println(name + " barks");
    }

    // Method to demonstrate field access
    public void printName() {
        System.out.println("Dog's name is: " + super.name); // Accesses the parent class field
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog("Buddy");

        // Call methods to demonstrate super keyword usage
        dog.makeSound();  // Output: Animal makes a sound
                          //         Buddy barks

        dog.printName();  // Output: Dog's name is: Buddy
    }
}
