package task5;

public class PrivateExample {
    private String name;
    int age;

    public PrivateExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private static void privateMethod () {
        System.out.println("Hello");
    }
}
