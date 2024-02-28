package File_IO.Question4;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question4/source.txt";
        String destinationFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question4/destination.txt";
        String fileContent = readFileContent(sourceFilePath);
        System.out.println("File Content: " + fileContent);
        String encryptedFileContent = encryptContent(fileContent);
        System.out.println("Encrypted Content: " + encryptedFileContent);
        String decryptedFileContent = decryptContent(encryptedFileContent);
        System.out.println("Decrypted Content: " + decryptedFileContent);
        writeToFile(destinationFilePath, decryptedFileContent);
    }

    private static String readFileContent(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner scanner = new Scanner(new File(filePath));
        while(scanner.hasNext())
            content.append(scanner.nextLine()).append("\n");
        return content.toString();
    }

    private static String encryptContent(String content) {
        StringBuilder result = new StringBuilder();
        for(char ch : content.toCharArray()) {
            if(Character.isAlphabetic(ch))
                result.append((char) ((((ch - 'a') + 1) % 26) + 'a'));
            else
                result.append(ch);
        }
        return result.toString();
    }

    private static String decryptContent(String content) {
        StringBuilder result = new StringBuilder();
        for(char ch : content.toCharArray()) {
            if(Character.isAlphabetic(ch))
                result.append((char) ((((ch - 'a') - 1) % 26) + 'a'));
            else
                result.append(ch);
        }
        return result.toString();
    }

    private static void writeToFile(String filePath, String content) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        fos.write(content.getBytes());
    }
}
