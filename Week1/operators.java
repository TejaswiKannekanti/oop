package java1;

public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        // Arithmetic operators
        int sum = a + b;          // Addition
        int diff = a - b;         // Subtraction
        int product = a * b;      // Multiplication
        int quotient = a / b;     // Division
        int remainder = a % b;    // Modulus
        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));   // Equal to
        System.out.println("a != b: " + (a != b));   // Not equal to
        System.out.println("a > b: " + (a > b));     // Greater than
        System.out.println("a < b: " + (a < b));     // Less than
        System.out.println("a >= b: " + (a >= b));   // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));   // Less than or equal to
        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));   // Logical AND
        System.out.println("x || y: " + (x || y));   // Logical OR
        System.out.println("!x: " + (!x));           // Logical NOT
    }
}

