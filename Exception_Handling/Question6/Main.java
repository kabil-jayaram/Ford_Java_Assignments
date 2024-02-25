package Exception_Handling.Question6;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 4 / 0;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            throw new NullPointerException();
        }
    }
}
