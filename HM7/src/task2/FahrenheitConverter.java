package task2;

public class FahrenheitConverter implements Converter {
    @Override
    public void convert(double celcius) {
        System.out.println("Fahrenheit temperature is: " + ((double) celcius * 1.8 + 32));
    }
}
