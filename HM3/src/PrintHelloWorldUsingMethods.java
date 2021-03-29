import java.util.ArrayList;

//task 10

public class PrintHelloWorldUsingMethods {
    public static void main(String[] args) {

        int[] helloWorld = new int[] {72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};

        printList(transformIntToChar(helloWorld));

    }
    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }
}
