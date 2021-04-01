//task 9

public class RecExample {
    public static void main(String[] args) {
        int result = sumOfNumbers(5, 10);
        System.out.println(result);
    }

    //return sum of all numbers between two arguments
    public static int sumOfNumbers(int firstNum, int secondNum) {
        if (secondNum > firstNum) {
            return secondNum + sumOfNumbers(firstNum, secondNum - 1);
        } else {
            return secondNum;
        }
    }
}

