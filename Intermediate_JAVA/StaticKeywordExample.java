public class StaticKeywordExample {

    // Static variable
    static int staticCount = 0;

    // Static block
    static {
        System.out.println("Static block executed.");
        staticCount = 10; // Initialize static variable
    }

    // Static method
    public static void printStaticCount() {
        System.out.println("Static count: " + staticCount);
    }

    // Constructor
    public StaticKeywordExample() {
        staticCount++;
        System.out.println("Constructor called. Static count: " + staticCount);
    }

    public static void main(String[] args) {
        // Call static method without creating an instance
        StaticKeywordExample.printStaticCount();

        // Create instances of StaticKeywordExample
        StaticKeywordExample example1 = new StaticKeywordExample();
        StaticKeywordExample example2 = new StaticKeywordExample();

        // Call static method again to see the updated count
        StaticKeywordExample.printStaticCount();
    }
}
