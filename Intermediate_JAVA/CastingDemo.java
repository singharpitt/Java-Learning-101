class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    public void wagTail() {
        System.out.println("Dog wags its tail");
    }
}

public class CastingDemo {
    public static void main(String[] args) {
        // Upcasting: Dog to Animal
        Animal animal = new Dog(); 
        animal.speak(); // Calls Dog's speak method

        // Downcasting: Animal to Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail(); // Calls Dog's wagTail method
        }
    }
}
