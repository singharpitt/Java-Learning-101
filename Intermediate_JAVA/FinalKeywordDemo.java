// Define the package name at the top (if using packages)

// Class with final variable and method
class FinalDemo {
    // Final variable
    public static final double PI = 3.14159;

    // Final method
    public final void displayConstant() {
        System.out.println("Final Keyword Demo:");
        System.out.println("PI: " + PI);
    }
}

// Class attempting to extend FinalDemo (will cause error)
// class ExtendedFinalDemo extends FinalDemo {} // Uncommenting this line will cause a compilation error

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();
        demo.displayConstant();
        
        // Final class cannot be extended, so no demo for that here
    }
}
