package Exception_Handling.Question8;

import java.io.FileInputStream;
import java.io.IOException;

class CustomIOException extends RuntimeException {
    private String message;

    public CustomIOException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            int result = 4 / 5;
            fis = new FileInputStream("src/main/java");
            if(fis == null)
                throw new CustomIOException("Custom Exception");
        } catch (ArithmeticException | NullPointerException | IOException ex) {
            ex.printStackTrace();
        } finally {
            fis.close();
            System.out.println("File closed successfully");
        }
    }
}
