package java1;

public class wrapperclass {
    public static void main(String[] args) {

        // ----------- Primitive to Wrapper (Boxing) -----------
        int a = 10;
        Integer aObj = Integer.valueOf(a); // Boxing
        System.out.println("Boxed Integer: " + aObj);

        // ----------- Wrapper to Primitive (Unboxing) -----------
        Double dObj = Double.valueOf(15.5);
        double d = dObj.doubleValue(); // Unboxing
        System.out.println("Unboxed double: " + d);

        // ----------- String to Primitive -----------
        String strNum = "123";
        int num = Integer.parseInt(strNum);
        double dnum = Double.parseDouble("45.67");
        System.out.println("String to int: " + num);
        System.out.println("String to double: " + dnum);

        // ----------- Primitive to String -----------
        String intStr = Integer.toString(a);
        String doubleStr = Double.toString(dnum);
        System.out.println("int to String: " + intStr);
        System.out.println("double to String: " + doubleStr);

        // ----------- Casting Between Wrapper Types -----------
        Integer intObj = 42;
        Double doubleObj = intObj.doubleValue(); // int to double
        System.out.println("Integer to Double: " + doubleObj);

        // ----------- Auto Boxing and Unboxing (Java 1.5+) -----------
        Integer autoBox = a; // Auto boxing
        int autoUnbox = autoBox; // Auto unboxing
        System.out.println("Auto Boxing: " + autoBox);
        System.out.println("Auto Unboxing: " + autoUnbox);
    }
}
