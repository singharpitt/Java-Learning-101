public class NestedLoops {
    public static void main(String[] args) {
        int rows = 10; // Number of rows in the multiplication table
        int cols = 10; // Number of columns in the multiplication table

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= cols; j++) {
                // Print the product of the current row and column numbers
                System.out.printf("%4d", i * j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
