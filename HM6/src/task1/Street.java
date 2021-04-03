package task1;

public class Street {
    String name;
    District district = new District();
    City city = new City();
    int numberOfHouses;
    int widthOfStreet;

    public Street(String name, District district, City city, int numberOfHouses, int widthOfStreet) {
        this.name = name;
        this.district = district;
        this.city = city;
        this.numberOfHouses = numberOfHouses;
        this.widthOfStreet = widthOfStreet;
    }
}
