class OuterClass {
    private String message = "Hello from Outer Class";

    class InnerClass {
        public void display() {
            System.out.println("Message from Inner Class: " + message);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Accessing inner class method
    }
}
