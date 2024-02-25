package Exception_Handling.Question4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Try to read from the file
            File file = new File("src");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            // Handle IOException
            System.err.println("An I/O error occurred: " + e.getMessage());

            // Check if the exception is a FileNotFoundException
            if (e instanceof FileNotFoundException) {
                // Handle FileNotFoundException
                System.err.println("File not found: " + e.getMessage());
            }
        }
    }
}
