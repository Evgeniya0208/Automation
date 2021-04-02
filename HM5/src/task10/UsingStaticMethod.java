package task10;

public class UsingStaticMethod {
    public static void main(String[] args) {
        StaticMethod.a = 10;
        System.out.println(StaticMethod.valDiv2(StaticMethod.a));
        StaticMethod z1 = new StaticMethod();
        z1.b = 20;
        System.out.println(StaticMethod.valDiv2(z1.b)); //non-static method - we don't need to create object to call it
        z1.valMult2(z1.b);

    }
}
