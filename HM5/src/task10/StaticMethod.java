package task10;

public class StaticMethod {
    static int a;
    int b;

    static int valDiv2(int a) {
        return a/2;
    }
    void valMult2(int b) {
        if (b > 100) {
            System.out.println("b is too big");
        } else{
            System.out.println("Hello b");
        }
    }
}
