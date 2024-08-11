class BaseClass {
    // Final method cannot be overridden
    public final void display() {
        System.out.println("This is a final method in the BaseClass.");
    }

    public void show() {
        System.out.println("This is a non-final method in the BaseClass.");
    }
}

class DerivedClass extends BaseClass {
    // Attempting to override the final method will cause a compile-time error
    // public void display() {
    //     System.out.println("Attempting to override the final method.");
    // }

    // Non-final methods can be overridden
    @Override
    public void show() {
        System.out.println("This is an overridden method in the DerivedClass.");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display(); // Calls the final method from BaseClass
        obj.show();    // Calls the overridden method from DerivedClass
    }
}
