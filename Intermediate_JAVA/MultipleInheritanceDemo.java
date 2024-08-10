// Interface for flying behavior
interface Flyable {
    void fly();
}

// Interface for swimming behavior
interface Swimmable {
    void swim();
}

// Class that implements both interfaces
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
    
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Create an instance of Duck
        Duck duck = new Duck();
        
        // Call methods from both interfaces
        duck.fly();   // Implements Flyable
        duck.swim();  // Implements Swimmable
    }
}
