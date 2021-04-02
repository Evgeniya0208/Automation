package task7two;

import task7one.Fruits;

public class Banana extends Fruits {
    public Banana() {
        System.out.println(name);
        System.out.println(weight); //has access to protected member because class Banana inherits class Fruits
    }
}
