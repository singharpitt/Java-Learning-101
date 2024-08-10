// Define the package name at the top (if using packages)
// package myfirstpackage;

// Base class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Another derived class
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog();   // Animal reference, Dog object
        myAnimal.makeSound();  // Output: Dog barks

        myAnimal = new Cat();   // Animal reference, Cat object
        myAnimal.makeSound();  // Output: Cat meows
    }
}
