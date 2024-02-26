package File_IO.Question3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question3/source.txt";
        String outputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question3/destination.txt";
        boolean fileExists = checkSourceFileExistence(inputFilePath);
        String content = null;
        if (checkSourceFileExistence(inputFilePath)) {
            try {
                copyFile(inputFilePath, outputFilePath);
                displaySuccessMessage();
            } catch (IOException e) {
                handleIOException(e);
            }
        } else {
            System.out.println("Source file does not exist.");
        }
    }

    private static boolean checkSourceFileExistence(String sourceFilePath) {
        File file = new File(sourceFilePath);
        return file.exists();
    }

    private static void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        FileInputStream fis = new FileInputStream(sourceFilePath);
        FileOutputStream fos = new FileOutputStream(destinationFilePath);
        int ch;
        while ((ch = fis.read()) != -1)
            fos.write(ch);
        fis.close();
        fos.close();
    }

    private static void displaySuccessMessage() {
        System.out.println("File Copied Successfully");
    }

    private static void handleIOException(IOException e) {
        System.out.println("An error occurred while copying the file: " + e.getMessage());
    }
}
