public class TypeConversionDemo {

    public static void main(String[] args) {
        // Implicit conversion (widening conversion)
        int intVal = 100;
        double doubleVal = intVal; // int to double

        // Explicit conversion (narrowing conversion)
        double doubleNum = 42.42;
        int intNum = (int) doubleNum; // double to int (cast required)

        // Print type conversion results
        System.out.println("Implicit Type Conversion:");
        System.out.println("int to double: " + doubleVal);

        System.out.println("\nExplicit Type Conversion:");
        System.out.println("double to int: " + intNum);
    }
}