//task 6

public class ShortLongShortString {
    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";

       if(a.length() > b.length()) {
            String c = b + a + b; //short+long+short
            System.out.println(c);
        }
        if (a.length() < b.length()) {
            String c = a + b + a; //short+long+short
            System.out.println(c);
        }
        if (a.length() == b.length()) {
            System.out.println("Length of strings is equal");
        }
    }
}
