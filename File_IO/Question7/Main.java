package File_IO.Question7;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            String inputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question7/input.txt";
            String outputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question7/output.txt";
            FileReader reader = new FileReader(inputFilePath);
            StringBuilder content = new StringBuilder();
            int ch;
            while((ch = reader.read()) != -1)
                content.append((char)ch);
            System.out.println("input.txt: " + content.toString());

            FileWriter writer = new FileWriter(outputFilePath);
            for (int i = 0;i < content.length();i++)
                writer.write(content.charAt(i));

            reader.close();
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
