

class GreetingDemo {
    // Method with a parameter
    public void sayHello(String name) {
        // Using the parameter 'name'
        System.out.println("Hello, " + name + "!");
    }
}

public class ParameterDemo {
    public static void main(String[] args) {
        GreetingDemo greeting = new GreetingDemo();
        
        // Passing an argument to the method
        greeting.sayHello("Alice"); // Output: Hello, Alice!
    }
}

