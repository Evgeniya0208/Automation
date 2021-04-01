//task 2
public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        if(anotherBoxer.age > 25 & anotherBoxer.weight < 84 || anotherBoxer.age > 25 &
                anotherBoxer.strength < 850 || anotherBoxer.weight < 84 & anotherBoxer.strength < 850) {
        return true;
        } else {
            return  false;
        }
    }

    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(27, 84, 950);
        Boxer anotherBoxer = new Boxer(23, 81, 800);

        System.out.println(ourBoxer.fight(anotherBoxer));
        System.out.println(anotherBoxer.fight(ourBoxer));

    }
}
