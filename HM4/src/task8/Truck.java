package task8;//task 8

public class Truck extends Car {

    private static int truckCount = 0; //(2) static var of child class is initialized second

    private int yearOfManufacture; //(5) non static vars of child class are initialized after constructor
    private String model;
    private int maxSpeed;

    public Truck(int yearOfManufacture, String model, int maxSpeed) { //(6) after all - constructor of object, that is created.
        // child class constructor is initialized after parent class constructor
        System.out.println("Hi from task8.Truck constructor");
        System.out.println("CarCounter from task8.Truck " + truckCount);
        this.yearOfManufacture = yearOfManufacture;
        this.model = model;
        this.maxSpeed = maxSpeed;

        Car.carCounter++;
        truckCount++;
    }

    public static void main(String[] args) {
        Truck truck = new Truck(2017, "Volvo1", 220);
        Truck secondTruck = new Truck(2018, "Volvo2", 225);
    }
}