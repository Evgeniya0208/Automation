package task4;

public class Planet {
    int size;
    int numberFromStar;
    double orbitalSpeed;

    public Planet (int size, int numberFromStar, double orbitalSpeed) {
        this.size = size;
        this.numberFromStar = numberFromStar;
        this.orbitalSpeed = orbitalSpeed;
    }

    public boolean isPlanetFast(double orbitalSpeed) {
        if (orbitalSpeed > 30.0) {
            return true;
        } else {
            return false;
        }
    }

    public void printNumberOfPlanet() {
        System.out.println("This planet is the " + numberFromStar + "th planet from the Sun.");
    }


}
