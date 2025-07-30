package java1;

public class stringconversion {
    public static void main(String[] args) {

        // Original string
        String original = "  Java Programming  ";

        // Trim spaces
        String trimmed = original.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // Convert to upper and lower case
        String upper = trimmed.toUpperCase();
        String lower = trimmed.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        // Substring
        String sub = trimmed.substring(5, 16);  // "Programming"
        System.out.println("Substring: " + sub);

        // Character at index
        char ch = trimmed.charAt(2);
        System.out.println("Character at index 2: " + ch);

        // String length
        int len = trimmed.length();
        System.out.println("Length: " + len);

        // Replace characters
        String replaced = trimmed.replace("a", "@");
        System.out.println("Replaced 'a' with '@': " + replaced);

        // String concatenation
        String extra = " is fun!";
        String combined = trimmed + extra;
        System.out.println("Concatenated: " + combined);

        // String comparison
        String str1 = "hello";
        String str2 = "HELLO";
        System.out.println("Equals: " + str1.equals(str2));                 // false
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2)); // true

        // String to char array
        char[] chars = trimmed.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }

        // Split string
        System.out.println("\nSplitting 'apple,banana,grape':");
        String fruits = "apple,banana,grape";
        String[] fruitArray = fruits.split(",");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}

