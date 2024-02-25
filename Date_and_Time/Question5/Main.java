package Date_and_Time.Question5;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Zone ID: ");
        String zone = scanner.nextLine();

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println(zonedDateTime);
    }
}
