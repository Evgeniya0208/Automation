package task4;

public class Jupiter extends Planet {
    String name;

    public Jupiter(int size, int numberFromStar, double orbitalSpeed, String name) {
        super(size, numberFromStar, orbitalSpeed);
        this.name = name;
    }

    @Override
    public boolean isPlanetFast(double orbitalSpeed) {
        if (orbitalSpeed == 13.07) {
        return false;
        } else {
            return true;
        }
    }

    @Override
    public void printNumberOfPlanet() {
        super.printNumberOfPlanet();
        System.out.println("Jupiter size is " + this.size);
    }
}
