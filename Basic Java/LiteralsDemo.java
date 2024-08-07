public class LiteralsDemo {
    public static void main(String[] args) {
        // Integer literals
        int decimalInt = 42;    // Decimal literal
        int octalInt = 052;     // Octal literal (prefix with 0)
        int hexInt = 0x2A;      // Hexadecimal literal (prefix with 0x)
        int binaryInt = 0b101010; // Binary literal (prefix with 0b)

        // Floating-point literals
        float floatLiteral = 3.14f;   // Float literal (suffix with f)
        double doubleLiteral = 3.14;  // Double literal

        // Boolean literals
        boolean boolTrue = true;   // Boolean literal
        boolean boolFalse = false; // Boolean literal

        // Character and string literals
        char charLiteral = 'A';    // Character literal
        String stringLiteral = "Hello, World!"; // String literal

        // Print literals
        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimalInt);
        System.out.println("Octal: " + octalInt);
        System.out.println("Hexadecimal: " + hexInt);
        System.out.println("Binary: " + binaryInt);

        System.out.println("\nFloating-point Literals:");
        System.out.println("Float: " + floatLiteral);
        System.out.println("Double: " + doubleLiteral);

        System.out.println("\nBoolean Literals:");
        System.out.println("True: " + boolTrue);
        System.out.println("False: " + boolFalse);

        System.out.println("\nCharacter and String Literals:");
        System.out.println("Character: " + charLiteral);
        System.out.println("String: " + stringLiteral);
    }
}
