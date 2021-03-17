import java.util.Arrays;
import java.lang.Math;

public class ArraySquareRoot {
    public static void main(String[] args) {
        int[] Array1 = new int[10];
        for(int i = 0; i < 10; i++) {
            Array1[i] = (i+2) * 4;
        }
        System.out.println("Initial array: " + Arrays.toString(Array1));

        double[] Array2 = new double[10];
        for(int i = 0; i < 10; i++) {
            Array2[i] = Math.sqrt(Array1[i]);
        }
        System.out.println("Double square root: " + Arrays.toString(Array2));

        int[] Array3 = new int[10];
        for(int i = 0; i < 10; i++) {
            Array3[i] = (int)Math.sqrt(Array1[i]);
        }
        System.out.println("Integer square root: " + Arrays.toString(Array3));
    }
}
