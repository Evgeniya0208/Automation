package task5;

public class TestException {
    public static void main(String[] args) {
        try {ThrowException.iCanThrowException();
        } catch (NullPointerException e) {
            System.out.println("I have caught an exception");
        }
    }
}
