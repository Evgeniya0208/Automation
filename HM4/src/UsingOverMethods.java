//task 10

public class UsingOverMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Jane";
        System.out.println(OverMethods.addingVars(str1, str2));
        double a = 2.5;
        double b = 3.7;
        System.out.println(OverMethods.addingVars(a, b));
        int c = 209;
        int d = 37;
        System.out.println(OverMethods.addingVars(c, d));
        int e = 192;
        System.out.println(OverMethods.addingVars(c, d, e));
    }
}
