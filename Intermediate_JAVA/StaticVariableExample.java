public class StaticVariableExample {

    // Static variable to count the number of instances
    static int instanceCount = 0;

    // Constructor
    public StaticVariableExample() {
        // Increment static variable when a new instance is created
        instanceCount++;
        System.out.println("New instance created. Total instances: " + instanceCount);
    }

    public static void main(String[] args) {
        // Create instances of StaticVariableExample
        StaticVariableExample example1 = new StaticVariableExample();
        StaticVariableExample example2 = new StaticVariableExample();
        StaticVariableExample example3 = new StaticVariableExample();

        // Display total number of instances created using the static variable
        System.out.println("Total instances created: " + StaticVariableExample.instanceCount);
    }
}
