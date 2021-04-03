package task1;

public class TestStreet {
    public static void main(String[] args) {
        Street street = new Street("Raduzhnaya", new District(), new City(), 84, 20);
        street.city.setName("Kiev");
        street.district.setName("Dneprovskiy");
        System.out.println(street.city.getName());
        System.out.println(street.district.getName());
    }
}
