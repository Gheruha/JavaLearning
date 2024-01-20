package OOP.circleRadius;

public class SimpleCircle {

    double radius;
    double perimeter;

    // Construct a circle with a later specified radius.
    public SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    // I can have how many constructors I want. But I need to have a diff num of
    // args , or diff type of args
    public SimpleCircle(double newRadius, double newPerimeter) {
        radius = newRadius;
        perimeter = newPerimeter;
    }

    double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
