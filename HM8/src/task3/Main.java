package task3;

public class Main {
    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;

            int[] c = {1};
            System.out.println(c[1]);
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds of array");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
