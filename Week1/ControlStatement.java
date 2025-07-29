package java1;

public class ControlStatement {
    public static void main(String[] args) {

        // 1. Conditional Statement: if-else
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // 2. Looping Statement: for loop
        System.out.println("For Loop from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // 3. Looping Statement: while loop
        int count = 1;
        System.out.println("While Loop from 1 to 3:");
        while (count <= 3) {
            System.out.println("While Count: " + count);
            count++;
        }

        // 4. Looping Statement: do-while loop
        int x = 0;
        System.out.println("Do-While Loop Example:");
        do {
            System.out.println("x is: " + x);
            x++;
        } while (x < 2);

        // 5. Branching Statement: break and continue
        System.out.println("Using break and continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping number 3");
                continue; // skips the rest of loop for i==3
            }
            if (i == 5) {
                System.out.println("Breaking at number 5");
                break; // exits loop when i==5
            }
            System.out.println("i = " + i);
        }

        // 6. Switch Case (also a conditional)
        int day = 2;
        System.out.println("Switch Case Example:");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }
    }
}
