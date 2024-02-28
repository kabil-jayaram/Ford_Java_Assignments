package File_IO.Question5;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = "/Users/kjayar18/IdeaProjects/Java-Assignments/src/main/java/File_IO/Question5/input.txt";
        String content = readFileContent(inputFilePath);
        System.out.print("Enter keyword to search: ");
        searchKeyword(content, scanner.next());
    }

    private static String readFileContent(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner scanner = new Scanner(new File(filePath));
        while(scanner.hasNext())
            content.append(scanner.nextLine()).append("\n");
        return content.toString();
    }

    private static void searchKeyword(String content, String keyword) {
        int lineNumber = 0;
        List<Integer> lineNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(content);
        System.out.print("Keyword '" + keyword + "' found in the line(s): ");
        while(scanner.hasNext()) {
            lineNumber++;
            if(scanner.nextLine().contains(keyword))
                lineNumbers.add(lineNumber);
        }
        displayResults(lineNumbers);
    }

    private static void displayResults(List<Integer> lineNumbers) {
        lineNumbers.forEach(line -> System.out.print(line + ", "));
    }
}
