//task 8

public class Car {

    public static int carCounter = 10;  //(1) static var of parent class is initialized first

    private String description = "some car"; //(3) non static var of parent class is initialized third

    public Car() {  //(4) parent class constructor is initialized before child class constructor
        System.out.println("Hi from Car constructor");
        System.out.println("Print carCounter " + carCounter);
        System.out.println(description);
        description = "new car";
        System.out.println(description);
    }

    public String getDescription() {
        return description;
    }
}