

class CounterDemo {
    // Static variable
    public static int count = 0;
    
    // Constructor to increase the count whenever a new object is created
    public CounterDemo() {
        count++;
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        // Creating objects of the CounterDemo class
        new CounterDemo();
        new CounterDemo();
        new CounterDemo();
        
        // Accessing the static variable through the class name
        System.out.println("Number of objects created: " + CounterDemo.count); // Output: 3
    }
}
