package java1;


import java.text.SimpleDateFormat;
import java.util.Date;

public class stringdatetimeapi {
    public static void main(String[] args) {

        // Current date and time
        Date now = new Date();
        System.out.println("Current Date-Time: " + now);

        // Format date-time
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formatted = formatter.format(now);
        System.out.println("Formatted Date-Time: " + formatted);

        // Parse string to date
        try {
            String input = "29-07-2025 14:30:00";
            Date parsedDate = formatter.parse(input);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
