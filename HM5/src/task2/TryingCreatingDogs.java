package task2;//task 2
import package1.*;
import package2.*;
public class TryingCreatingDogs {
    public static void main(String[] args) {
        //Dog myDog = new Dog("Boxer", "middle", 2);
        //Dog otherDog = new Dog("Spike", true, true, false);
// getting error: java: reference to Dog is ambiguous
//  both class package2.Dog in package2 and class package1.Dog in package1 match
        // we must always specify packages if there are the same class names
    }
}
