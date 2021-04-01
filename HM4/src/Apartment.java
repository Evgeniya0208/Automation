//task 5

public class Apartment {
    public String metroStation;
    public double apartmentArea;
    public int floor;
    public int numberOfBedrooms;
    public int numberOfBathrooms;

    public Apartment(String metroStation) {
        this.metroStation = metroStation;
        System.out.println("constructor 1 - 1 arg");
    }

    public Apartment(String metroStation, double apartmentArea) {
        this(metroStation);
        this.apartmentArea = apartmentArea;
        System.out.println("constructor 2 - 2 args");
    }

    public Apartment(String metroStation, double apartmentArea, int floor, int numberOfBedrooms, int numberOfBathrooms) {
        //this(apartmentArea);
        this(metroStation, apartmentArea);
        this.floor = floor;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        System.out.println("constructor 3 - 5 args");
    }

    public static void main(String[] args) {
    Apartment apartment = new Apartment("Darnitsa", 94.2, 8, 2, 2);
}
}
