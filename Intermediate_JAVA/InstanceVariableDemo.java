package Intermediate_JAVA;

class CarDemo {
    // Instance variable
    public String model;
    
    // Constructor to initialize the instance variable
    public CarDemo(String model) {
        this.model = model;
    }
    
    // Method to get the model of the car
    public String getModel() {
        return model;
    }
}

public class InstanceVariableDemo {
    public static void main(String[] args) {
        // Creating two objects of the CarDemo class
        CarDemo car1 = new CarDemo("Toyota");
        CarDemo car2 = new CarDemo("Honda");

        // Each object has its own copy of the instance variable 'model'
        System.out.println(car1.getModel()); // Output: Toyota
        System.out.println(car2.getModel()); // Output: Honda
    }
}
