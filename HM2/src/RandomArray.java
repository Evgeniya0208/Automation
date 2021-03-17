import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        int[] newArray = new int[10];

        for(int i = 0; i < 10; i++) {
            Random random= new Random();
            int randomInt = random.nextInt(1000);
            newArray[i] = randomInt;
        }

        for(int k: newArray) {
            System.out.println(k);
        }
    }
}
