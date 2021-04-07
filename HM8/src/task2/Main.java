package task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        try {
            return a / b;
        } catch (ArithmeticException c) {
            System.out.println("Division by zero returns zero");
            return 0;
        }
    }
}
