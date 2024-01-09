package testJava;

class justTest {
    public static void main(String[] args) {
        String x = "water";
        String y = "blackWater";
        String temp = null;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("temp: " + temp);
    }

}