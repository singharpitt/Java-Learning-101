package Advance_Java;

public class SimpleThreadStatesDemo {

    public static void main(String[] args) {
        // Create a thread instance
        Thread demoThread = new Thread(() -> {
            try {
                System.out.println("Thread state during run: " + Thread.currentThread().getState());
                
                // Timed Waiting state
                Thread.sleep(500); // Sleep for 500 milliseconds
                System.out.println("Thread state after sleep: " + Thread.currentThread().getState());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        });

        // Check the thread state before starting it
        System.out.println("Thread state before start: " + demoThread.getState());

        // Start the thread
        demoThread.start();
        
        // Wait for the thread to finish
        try {
            // Wait for the thread to complete its execution
            demoThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted during join");
        }

        // Check the thread state after it has completed
        System.out.println("Thread state after completion: " + demoThread.getState());
        
        // Main thread state
        System.out.println("Main thread state: " + Thread.currentThread().getState());
    }
}
