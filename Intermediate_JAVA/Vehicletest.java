// Interface with two methods
public interface Vehicletest {
    void start();
    void stop();
}

// Car class implementing the Vehicle interface
class Car implements Vehicletest {
    @Override
    public void start() {
        System.out.println("Car starting");
    }
    @Override
    public void stop() {
        System.out.println("Car stopping");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Vehicletest myCar = new Car();
        myCar.start(); // Calls Car's start method
        myCar.stop();  // Calls Car's stop method
    }
}
