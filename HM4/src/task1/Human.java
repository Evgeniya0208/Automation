package task1;

//task1
public class Human {
    public double weight;
    public int age;
    public String firstName;
    public String lastName;
    public int height;

    public Human(double weight, int age, String firstName, String lastName, int height) {
        weight = weight;
        age = age;
        firstName = firstName;
        lastName = lastName;
        height = height;
    }

    public static void main(String[] args) {
        Human human = new Human(80, 43, "John", "Smith", 186);
    }

}
