package java1;

public class stringmanipulation {
    public static void main(String[] args) {

        String str = "  Hello Java Programming  ";

        // Trim whitespace
        String trimmed = str.trim();
        System.out.println("Trimmed String: '" + trimmed + "'");

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // Length of string
        System.out.println("Length: " + trimmed.length());

        // Character at index
        System.out.println("Character at index 6: " + trimmed.charAt(6));

        // Substring
        System.out.println("Substring (6 to 10): " + trimmed.substring(6, 10));

        // Check if contains a word
        System.out.println("Contains 'Java'? " + trimmed.contains("Java"));

        // Replace characters
        System.out.println("Replace 'a' with '@': " + trimmed.replace('a', '@'));

        // String startsWith and endsWith
        System.out.println("Starts with 'Hello'? " + trimmed.startsWith("Hello"));
        System.out.println("Ends with 'ing'? " + trimmed.endsWith("ing"));

        // Split string
        String data = "apple,banana,grape";
        String[] fruits = data.split(",");
        System.out.println("Split string:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // String comparison
        String s1 = "Java";
        String s2 = "java";
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));

        // Concatenation
        String combined = s1.concat(" Programming");
        System.out.println("Concatenated: " + combined);

        // Index of character or substring
        System.out.println("Index of 'J': " + trimmed.indexOf('J'));
        System.out.println("Index of 'Programming': " + trimmed.indexOf("Programming"));

        // Convert to char array and print
        char[] chars = trimmed.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println(); // To move to a new line after printing characters
    }
}
