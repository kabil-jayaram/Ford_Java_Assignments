package Exception_Handling.Question5;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("example.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String firstLine = br.readLine();
            System.out.println("First line of the file: " + firstLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
