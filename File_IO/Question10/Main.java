package File_IO.Question10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question10/input.txt";
        String outputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question10/output.txt";

        LineNumberReader reader = null;
        PrintWriter writer = null;
        try {
            reader = new LineNumberReader(new FileReader(inputFilePath));
            writer = new PrintWriter(new FileWriter(outputFilePath));

            String line = "";
            int lineNumber = 1;

            while((line = reader.readLine()) != null) {
                line = lineNumber + ": " + line + "\n";
                lineNumber++;
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            writer.close();
        }
    }
}
