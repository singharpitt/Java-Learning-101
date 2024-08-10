public class StringBasics {

    public static void main(String[] args) {
        // Create a string
        String text = "Hello, Java!";

        // Convert to uppercase
        String upperText = text.toUpperCase();
        System.out.println("Uppercase: " + upperText);

        // Find the length of the string
        int length = text.length();
        System.out.println("Length: " + length);

        // Concatenate with another string
        String concatenatedText = text + " Welcome to string basics.";
        System.out.println("Concatenated: " + concatenatedText);

        // Check if the string contains a substring
        boolean containsWord = text.contains("Java");
        System.out.println("Contains 'Java': " + containsWord);

        // Get a substring from the string
        String substring = text.substring(7, 11);
        System.out.println("Substring: " + substring);

        // Replace a part of the string
        String replacedText = text.replace("Java", "World");
        System.out.println("Replaced Text: " + replacedText);
    }
}
