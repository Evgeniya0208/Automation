package task9;

public class AddingFields {
    public static void main(String[] args) {
        SomeFields x1 = new SomeFields();
        SomeFields x2 = new SomeFields();

        x1.x = 10;
        x2.x = 20;
        System.out.println("Non-static fields: " + x1.x + " " + x2.x);

        SomeFields.y = 7; //static field is common for x1 and x2 objects
        System.out.println("Static field: " + SomeFields.y);

        System.out.println("x1 sum: " + x1.sumOfVal());
        System.out.println("x2 sum: " + x2.sumOfVal());

        SomeFields.y = 10;

        System.out.println("Static field new value: " + SomeFields.y);

        System.out.println("x1 sum: " + x1.sumOfVal());
        System.out.println("x2 sum: " + x2.sumOfVal());



    }
}
