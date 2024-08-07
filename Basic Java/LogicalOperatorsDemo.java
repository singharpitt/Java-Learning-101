public class LogicalOperatorsDemo {

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical operations
        boolean andResult = x && y; // Logical AND
        boolean orResult = x || y;  // Logical OR
        boolean notResult = !x;     // Logical NOT

        // Print results
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + andResult);
        System.out.println("x || y: " + orResult);
        System.out.println("!x: " + notResult);
    }
}
