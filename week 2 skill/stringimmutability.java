package java1;

public class stringimmutability {
    public static void main(String[] args) {

        String original = "Java";

        // Modify the string using concat
        String modified = original.concat(" Programming");

        // Print both strings
        System.out.println("Original String: " + original);   // Java
        System.out.println("Modified String: " + modified);   // Java Programming

        // Explanation:
        // Strings are immutable. Methods like concat() return a new String,
        // but do not change the original object.
    }
}
