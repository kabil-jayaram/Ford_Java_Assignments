package File_IO.Question2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question2/input.txt";
        String outputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question2/output.txt";
        boolean fileExists = checkFileExistance(inputFilePath);
        String content = null;
        if(fileExists) {
            System.out.println("File exists: " + fileExists);
            content = readFileContent(inputFilePath);
            System.out.println("File content: " + content);
            writeFileContent(outputFilePath, content);
            displayFileInfo(inputFilePath);
        }
    }

    private static boolean checkFileExistance(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

    private static String readFileContent(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            if(scanner.hasNext()) {
                return scanner.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return "";
    }

    private static void writeFileContent(String filePath, String content) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(content.getBytes());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + filePath);
        }
    }

    private static void displayFileInfo(String filePath) {
        File file = new File(filePath);
        System.out.println("File Information:");
        System.out.println("Name: " + file.getName());
        System.out.println("Size: " + file.length() + " bytes");
    }
}
