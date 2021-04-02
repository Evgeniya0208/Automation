package task2;

public class Fight {
    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(27, 84, 950);
        Boxer anotherBoxer = new Boxer(23, 81, 800);

        System.out.println(ourBoxer.fight(anotherBoxer));
        System.out.println(anotherBoxer.fight(ourBoxer));

    }
}
