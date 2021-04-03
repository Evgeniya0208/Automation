package task2;

public class KelvinConverter implements Converter {
    @Override
    public void convert(double celcius) {
        System.out.println("Kelvin temperature is: " + ((double) celcius + 273.15));
    }
}
