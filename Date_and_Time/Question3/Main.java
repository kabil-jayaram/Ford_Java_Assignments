package Date_and_Time.Question3;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String formattedDateTime = formatter.format(localDateTime);
        System.out.println(formattedDateTime);
    }
}
