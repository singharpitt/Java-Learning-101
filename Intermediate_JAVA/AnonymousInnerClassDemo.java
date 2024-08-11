interface Greeting {
    void sayHello();
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        greeting.sayHello(); // Calls the method in the anonymous inner class
    }
}
