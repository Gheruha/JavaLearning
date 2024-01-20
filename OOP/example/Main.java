package OOP.example;

public class Main {
    public static void main(String[] args) {

        Exercise first = new Exercise();

        System.out.printf("The name of first exercise is: %s \nCurrent pr is: %d kg.\n", first.name, first.pr);
        first.doingExercise();
    }
}
