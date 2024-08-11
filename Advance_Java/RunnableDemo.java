package Advance_Java;

// Class A that implements Runnable and prints "Hello"
class HelloRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10); // Sleep for a short period to allow other thread to run
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("HelloRunnable interrupted");
            }
        }
    }
}

// Class B that implements Runnable and prints "World"
class WorldRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("World");
            try {
                Thread.sleep(10); // Sleep for a short period to allow other thread to run
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("WorldRunnable interrupted");
            }
        }
    }
}

// Main class to start the threads
public class RunnableDemo {
    public static void main(String[] args) {
        // Create instances of the Runnable implementations
        Runnable helloRunnable = new HelloRunnable();
        Runnable worldRunnable = new WorldRunnable();

        // Create threads with the Runnable instances
        Thread threadA = new Thread(helloRunnable);
        Thread threadB = new Thread(worldRunnable);

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
