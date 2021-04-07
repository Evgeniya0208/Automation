package task1;

public class Number {

    public void quantity (int n) {
        if (n < 0) {
            System.out.println("Number < 0");
        }
        else if (n == 0) {
            throw new ArithmeticException ("Number is 0. Enter correct number");
        }
        else {
            System.out.println("Number > 0");
        }
    }

}
