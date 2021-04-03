package task4;

public class TurnJupiter {
    public static void main(String[] args) {
        Jupiter jupiter = new Jupiter(69911, 5, 13.07, "Jupiter");
        Planet mars = new Planet(3389, 4, 24.13);
        System.out.println(mars.isPlanetFast(mars.orbitalSpeed));
        mars.printNumberOfPlanet();
        System.out.println(jupiter.isPlanetFast(jupiter.orbitalSpeed));
        jupiter.printNumberOfPlanet();
    }

}
