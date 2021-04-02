package task5;

public class UsingPrivateExample {
    public static void main(String[] args) {
        PrivateExample man = new PrivateExample("John", 38);
        //System.out.println(man.name); no access to private field
        System.out.println(man.age);
        //PrivateExample.privateMethod(); no access to private method
    }
}
