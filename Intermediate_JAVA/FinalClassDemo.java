// Final class cannot be extended
final class ImmutableClass {
    public void display() {
        System.out.println("This is a method in the final class ImmutableClass.");
    }
}

// Attempting to extend the final class will cause a compile-time error
// class SubClass extends ImmutableClass {
//     // This will result in a compile-time error
// }

public class FinalClassDemo {
    public static void main(String[] args) {
        ImmutableClass obj = new ImmutableClass();
        obj.display(); // Calls the method in the final class
    }
}
