package task4one;

public class PublicExample { //class is available for all
    public static String name; //field is available for all
    int age; //package private field
    public PublicExample(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void printHello() { //method is available for all
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        PublicExample dog = new PublicExample("Spike", 5);
    }
}
