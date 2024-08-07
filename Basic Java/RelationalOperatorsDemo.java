public class RelationalOperatorsDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Relational operations
        boolean isEqual = (a == b);     // Equal to
        boolean isNotEqual = (a != b);  // Not equal to
        boolean isGreater = (a > b);    // Greater than
        boolean isLess = (a < b);       // Less than
        boolean isGreaterOrEqual = (a >= b); // Greater than or equal to
        boolean isLessOrEqual = (a <= b);    // Less than or equal to

        // Print results
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLess);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLessOrEqual);
    }
}
