package File_IO.Question8;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            String inputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question8/input.txt";
            String outputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question8/output.txt";
            reader = new BufferedReader(new FileReader(inputFilePath));
            writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line = "";
            while((line = reader.readLine()) != null) {
                line = line.toUpperCase();
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            writer.close();
        }
    }
}
