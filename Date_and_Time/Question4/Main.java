package Date_and_Time.Question4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two date in YYYY-MM-DD HH:mm:ss: ");
        String date1 = scanner.nextLine();
        String date2 = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime LocalDateTime1 = LocalDateTime.parse(date1, formatter);
        LocalDateTime LocalDateTime2 = LocalDateTime.parse(date2, formatter);

        Duration duration;

        if(LocalDateTime1.isAfter(LocalDateTime2)) {

            duration = Duration.between(LocalDateTime2, LocalDateTime1);
        }
        else
            duration = Duration.between(LocalDateTime1, LocalDateTime2);

        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() %  60;
        long seconds = duration.getSeconds() %  60;

        System.out.println("Duration: " + days + " days, " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
