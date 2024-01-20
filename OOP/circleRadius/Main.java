package OOP.circleRadius;

public class Main {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle(120);
        System.out.printf("Area of circle one is %f \n", circle1.getArea());

        SimpleCircle circle2 = new SimpleCircle(150);
        System.out.printf("Perimeter of circle two is %f \n", circle2.getPerimeter());


        // Here I used the constructor num 3 of my SimpleCircle class
        SimpleCircle circle3 = new SimpleCircle(90, 120);
    }
}
