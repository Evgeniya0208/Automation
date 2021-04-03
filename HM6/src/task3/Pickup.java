package task3;

public class Pickup extends Car {
    String type;
    String model;
    String color;
    public Pickup (String name, String size, String model, String color, int maxSpeed) {
        super(name, size, maxSpeed);
        this.model = model;
        this.color = color;
        this.type = "pickup";
    }

    public void currentState() {
        System.out.println("Current velocity is: " + this.getCurrentVelocity() + ". " + "Current gear is: " + this.getCurrentGear() +
                ". " + "Current direction is: " + this.getCurrentDirection() + ".");
    }

    public void alignSteer() {
        setCurrentDirection(0);
        System.out.println("Steer is aligned. Car is going straight");
    }

}
