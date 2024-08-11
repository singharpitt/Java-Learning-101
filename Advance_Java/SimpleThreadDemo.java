package Advance_Java;

// Class A that prints "Hello"
class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10); // Sleep for a short period to allow other thread to run
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread A interrupted");
            }
        }
    }
}

// Class B that prints "World"
class B extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("World");
            try {
                Thread.sleep(10); // Sleep for a short period to allow other thread to run
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread B interrupted");
            }
        }
    }
}

// Main class to start the threads
public class SimpleThreadDemo {
    public static void main(String[] args) {
        // Create instances of the threads
        Thread threadA = new A();
        Thread threadB = new B();

        // Start threadA
        threadA.start();
        
        // Introduce a delay before starting threadB
        try {
            Thread.sleep(5); // 5 milliseconds delay
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted during sleep");
        }

        // Start threadB
        threadB.start();

        // Wait for both threads to complete
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted during join");
        }

        System.out.println("Both threads have finished execution.");
    }
}
