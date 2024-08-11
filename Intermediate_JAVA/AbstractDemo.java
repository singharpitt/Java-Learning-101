abstract class Shape {
    abstract void draw();

    public void description() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw(); // Calls Circle's draw method
        shape.description(); // Calls Shape's description method
    }
}
