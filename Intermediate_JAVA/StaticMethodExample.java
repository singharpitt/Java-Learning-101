public class StaticMethodExample {

    // Static variable to keep track of a count
    static int staticCount = 0;

    // Static method: Can be called without creating an instance of the class
    public static void incrementStaticCount() {
        staticCount++;
        System.out.println("Static count incremented: " + staticCount);
    }

    // Instance variable
    private int instanceCount = 0;

    // Instance method: Can only be called on an instance of the class
    public void incrementInstanceCount() {
        instanceCount++;
        System.out.println("Instance count incremented: " + instanceCount);
    }

    public static void main(String[] args) {
        // Call static method directly using the class name
        StaticMethodExample.incrementStaticCount(); // Output: Static count incremented: 1
        StaticMethodExample.incrementStaticCount(); // Output: Static count incremented: 2

        // Create an instance of StaticMethodExample
        StaticMethodExample example1 = new StaticMethodExample();

        // Call instance method using the instance
        example1.incrementInstanceCount(); // Output: Instance count incremented: 1
        example1.incrementInstanceCount(); // Output: Instance count incremented: 2

        // Create another instance of StaticMethodExample
        StaticMethodExample example2 = new StaticMethodExample();

        // Call instance method on a different instance
        example2.incrementInstanceCount(); // Output: Instance count incremented: 1
        example2.incrementInstanceCount(); // Output: Instance count incremented: 2

        // Call static method again to see the updated static count
        StaticMethodExample.incrementStaticCount(); // Output: Static count incremented: 3
    }
}
