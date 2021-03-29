//task 9
public class StringEndWithDot {
    public static void main(String[] args) {
        String A = "Hello";
        String B = "Bye.";
        if(A.endsWith(".")) {
            System.out.println(A);
        }
            else {
                String C = A + ".";
                System.out.println(C);
        }
    }
}
