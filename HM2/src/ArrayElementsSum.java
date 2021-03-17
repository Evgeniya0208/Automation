import java.util.Random;

public class ArrayElementsSum {
    public static void main(String[] args) {
        int[] arrayForSum = new int[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomInt = random.nextInt(75);
            arrayForSum[i] = randomInt;
        }
        for(int j: arrayForSum) {
            System.out.println(j);
        }
        //sum without first and last element
        int sum = 0;
        for (int k = 1; k < arrayForSum.length - 1; k++) {
            sum += arrayForSum[k];
        }
        System.out.println("Sum is: " + sum);
    }
}
