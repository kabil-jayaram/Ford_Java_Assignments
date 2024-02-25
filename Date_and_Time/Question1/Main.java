package Date_and_Time.Question1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any date in YYYY-MM-DD: ");
        String date = scanner.next();

        LocalDate localDate = LocalDate.parse(date);
        String dayOfWeek = localDate.getDayOfWeek().toString();
        System.out.println(dayOfWeek);
    }
}
