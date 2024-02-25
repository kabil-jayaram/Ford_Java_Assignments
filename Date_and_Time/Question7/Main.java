package Date_and_Time.Question7;

import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any two date in YYYY-MM-DD: ");
        String date = scanner.next();

        LocalDate localDate = LocalDate.parse(date);
        ZoneId zoneId = ZoneId.systemDefault(); // Use the system's default time zone
        ZonedDateTime dateTime = localDate.atStartOfDay(zoneId);
        ZonedDateTime dateTimeStandard = dateTime.withZoneSameInstant(zoneId).withZoneSameLocal(ZoneId.of("UTC"));

        // Check if the ZonedDateTime is in daylight saving time
        boolean isDaylightSaving = !dateTime.getOffset().equals(dateTimeStandard.getOffset());

        // Output the result
        System.out.println("The date  is " + (isDaylightSaving ? "within" : "not within") + " the daylight saving time period.");
    }
}
