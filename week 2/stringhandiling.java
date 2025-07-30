package java1;

public class stringhandiling {
    public static void main(String[] args) {

        // Creating strings
        String str1 = "Java";
        String str2 = "Programming";
        String str3 = "Java";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        // Length of the string
        System.out.println("Length of result: " + result.length());

        // Uppercase and Lowercase
        System.out.println("Uppercase: " + result.toUpperCase());
        System.out.println("Lowercase: " + result.toLowerCase());

        // Character at a specific position
        System.out.println("Character at index 3: " + result.charAt(3));

        // Substring
        System.out.println("Substring (5 to 11): " + result.substring(5, 11));

        // Comparing strings
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // Checking if string contains a word
        System.out.println("Does result contain 'gram': " + result.contains("gram"));

        // Replace characters
        System.out.println("Replace 'a' with '@': " + result.replace('a', '@'));

        // Trim leading and trailing spaces
        String spaced = "   Hello Java!   ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // Splitting string
        String data = "apple,banana,grape";
        String[] fruits = data.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
