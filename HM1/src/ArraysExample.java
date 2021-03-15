import java.util.Arrays;

public class ArraysExample{
    public static void main(String[] args){
        int[] myIntegerArray = new int [10];
        double[] myDoubleArray = new double [5];

        for(int i = 0; i < 10; i++) {
            myIntegerArray[i] = i + 7;
        }
        System.out.println(Arrays.toString(myIntegerArray));
        System.out.println(myIntegerArray.length);

        for(int j = 0; j < 5; j++) {
            myDoubleArray[j] = j + 2 * 1.27;
        }
        System.out.println(Arrays.toString(myDoubleArray));
        double firstElement = myDoubleArray[0];
        double lastElement = myDoubleArray[4];
        System.out.println(firstElement);
        System.out.println(lastElement);
    }
}
