package Date_and_Time.Question6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any two date in YYYY-MM-DD: ");
        String date = scanner.next();
        System.out.print("Enter the number of days to add or subtract: ");
        int days = scanner.nextInt();

        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate.plusDays(days));
    }
}
