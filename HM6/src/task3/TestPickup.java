package task3;

public class TestPickup {
    public static void main(String[] args) {
        Pickup myPickup = new Pickup("Toyota", "4720 x 1770 x 1955", "Land Cruisser 70", "black", 160);
        myPickup.currentState();

        myPickup.move(120, -10);
        myPickup.changeGear(120);
        myPickup.currentState();
        myPickup.printDirection(-10);
        myPickup.alignSteer();

        myPickup.stop();

        myPickup.currentState();


    }
}
