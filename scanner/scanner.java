package scanner;

import java.util.Scanner;

class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your name:");
        String name = scanner.nextLine();

        System.out.println("Write your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your favorite sport: ");
        String sport = scanner.nextLine();

        System.out.println("Your name is " + name + "\nYou have " + age + "years old.\nAnd your like " + sport);
        scanner.close();
    }
}