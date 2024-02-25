package Date_and_Time.Question2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two date in YYYY-MM-DD: ");
        String date1 = scanner.next();
        String date2 = scanner.next();

        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);

        if(localDate1.isAfter(localDate2))
            System.out.println("First date is after second date");
        else if (localDate1.isBefore(localDate2))
            System.out.println("First date is before second date");
        else
            System.out.println("First date is equal to the second date");
    }
}
