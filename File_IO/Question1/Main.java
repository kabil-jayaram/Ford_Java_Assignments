package File_IO.Question1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question1/sample.txt";
        String outputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question1/word_count.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(inputFilePath))) {
            while (scanner.hasNext()) {
                String[] words = scanner.nextLine().toLowerCase().split("\\s+");
                for (String word : words)
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFilePath);
            return;
        }

        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                String line = entry.getKey() + ": " + entry.getValue() + "\n";
                fos.write(line.getBytes());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + outputFilePath);
        }

        System.out.println("Word count written to " + outputFilePath);
    }
}
