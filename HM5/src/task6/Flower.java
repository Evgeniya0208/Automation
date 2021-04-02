package task6;

//task 6
public class Flower {
    private Flower () {
        System.out.println("It is a private constructor");
    }
    public static Flower createFlower() {
        return new Flower();
    }

    public static void main(String[] args) {
        Flower flower1 = new Flower();
        Flower flower2 = Flower.createFlower();
    }
}
