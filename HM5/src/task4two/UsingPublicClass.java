package task4two;

import task4one.PublicExample;

public class UsingPublicClass {

    public static void main(String[] args) {
        PublicExample cat = new PublicExample("Archer", 8);
        System.out.println(cat.name);
        //System.out.println(cat.age); no access to package-private field in public class
        PublicExample.printHello();
    }
}
