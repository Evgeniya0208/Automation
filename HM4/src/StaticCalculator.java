//task 4
public class StaticCalculator {
    double firstValue;
    double secondValue;
    String operation;
    double result;

    public StaticCalculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }
    public void calculateResult() {
        switch (operation) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                result = firstValue / secondValue;
                break;
            default: result = 0.0;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        StaticCalculator operation1 = new StaticCalculator(7, 3, "/");
        operation1.calculateResult();
    }
}
