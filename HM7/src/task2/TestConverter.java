package task2;

public class TestConverter {
    public static void main(String[] args) {
        KelvinConverter kelvin = new KelvinConverter();
        kelvin.convert(37);
        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        fahrenheit.convert(37);
    }
}
