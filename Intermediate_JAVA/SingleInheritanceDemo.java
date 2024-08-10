// Parent class
class Animal {
    // Method in the parent class
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inherits from Animal
class Dog extends Animal {
    // Method in the child class
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();
        
        // Call methods from both Dog and Animal
        dog.eat();   // Inherited from Animal
        dog.bark();  // Defined in Dog
    }
}
