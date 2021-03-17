import java.util.Arrays;
import java.util.Random;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arrayForSorting = new int[15];

        for(int i = 0; i < 15; i++) {
            Random random= new Random();
            int randomInt = random.nextInt(127);
            arrayForSorting[i] = randomInt;
        }
        System.out.println("Исходный массив: " + Arrays.toString(arrayForSorting));

        //Bubble sorting
        int t;

        for (int j = 1; j < arrayForSorting.length; j++) {
            for (int k = arrayForSorting.length - 1; k >= j; k-- ) {
                if (arrayForSorting[k-1] > arrayForSorting[k]) {
                    t = arrayForSorting[k-1];
                    arrayForSorting[k-1] = arrayForSorting[k];
                    arrayForSorting[k] = t;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arrayForSorting));

    }
}
