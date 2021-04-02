package task2;

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
        if(anotherBoxer.age > this.age & anotherBoxer.weight < this.weight || anotherBoxer.age > this.age &
                anotherBoxer.strength < this.strength || anotherBoxer.weight < this.weight & anotherBoxer.strength < this.strength) {
        return true;
        } else {
            return  false;
        }
    }
}
