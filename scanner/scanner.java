package scanner;

import java.util.Scanner;

class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name:");

        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
        scanner.close();
    }
}