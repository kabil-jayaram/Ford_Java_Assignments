package Date_and_Time.Question8;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any two date in YYYY-MM-DD: ");
        String date = scanner.next();
        System.out.print("Enter a day of the weed: ");
        String day = scanner.next();

        LocalDate localDate = LocalDate.parse(date);
        DayOfWeek targetDayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
        LocalDate nextDay = localDate.with(TemporalAdjusters.next(targetDayOfWeek));
        System.out.println(nextDay);
    }
}
