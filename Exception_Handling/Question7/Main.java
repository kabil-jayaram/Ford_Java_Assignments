package Exception_Handling.Question7;

public class Main {
    public static void main(String[] args) {
        try {
            throwsException();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void throwsException() {
        try {
            int result = 1 / 0;
        } catch(ArithmeticException ex) {
            System.out.println("Exception causht and rethrown");
            throw ex;
        }
    }
}
