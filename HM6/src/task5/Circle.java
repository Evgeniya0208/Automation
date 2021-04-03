package task5;

public class Circle extends Figure {
    double radius;
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
