// Define the package name at the top (if using packages)

// Base class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

// Derived class
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

// Another derived class
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Vehicle myVehicle;

        myVehicle = new Car();   // Vehicle reference, Car object
        myVehicle.start();      // Output: Car is starting

        myVehicle = new Bike();  // Vehicle reference, Bike object
        myVehicle.start();      // Output: Bike is starting
    }
}
