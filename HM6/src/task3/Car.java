package task3;

public class Car extends Vehicle {
    String currentGear;
    int maxSpeed;

    public Car (String name, String size, int maxSpeed) {
        super(name, size);
        this.maxSpeed = maxSpeed;
        this.currentGear = "N";
    }

    public String getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(String currentGear) {
        this.currentGear = currentGear;
    }

    public void changeGear(int getCurrentVelocity) {
        if(getCurrentVelocity == 0) {
            setCurrentGear("N");
        }
        if (getCurrentVelocity <= 40) {
            setCurrentGear("1");
        }
        if (getCurrentVelocity > 40 & getCurrentVelocity <= 60) {
            setCurrentGear("2");
        }
        if (getCurrentVelocity > 60 & getCurrentVelocity <= 80) {
            setCurrentGear("3");
        }
        if (getCurrentVelocity > 80 & getCurrentVelocity <= 100) {
            setCurrentGear("4");
        }
        if (getCurrentVelocity > 100 & getCurrentVelocity <= maxSpeed) {
            setCurrentGear("5");
        }
    }

    public void printDirection(int getCurrentDirection) {
        if(getCurrentDirection == 0) {
            System.out.println("Car is going straight");
        }
        if (getCurrentDirection < 0 & getCurrentDirection >= -90) {
            System.out.println("Car turns left");
        }
        if (getCurrentDirection > 0 & getCurrentDirection <= 90) {
            System.out.println("Car turns right");
        }
    }

    @Override
    public void stop() {
        super.stop();
        this.currentGear = "N";
        System.out.println("Current velocity is " + this.getCurrentVelocity() + ". " + "Current gear is " +
                this.getCurrentGear() + ". " + "Car is stopped.");
    }
}
