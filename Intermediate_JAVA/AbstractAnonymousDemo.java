abstract class Animal {
    abstract void makeSound();
}

public class AbstractAnonymousDemo {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Animal makes a sound");
            }
        };
        animal.makeSound(); // Calls the method in the anonymous inner class
    }
}
