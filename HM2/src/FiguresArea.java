import java.lang.Math;

public class FiguresArea {
    public static void main(String[] args) {
        double radius = 4.7;
        double a = 2;
        double circleArea = Math.PI * Math.pow(radius, a);
        System.out.println("Area of circle is " + circleArea);

        double sideOne = 2.4;
        double  sideTwo = 3.7;
        double rectangleArea = sideOne * sideTwo;
        System.out.println("Area of rectangle is " + rectangleArea);
    }
}
