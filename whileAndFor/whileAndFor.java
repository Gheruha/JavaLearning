package whileAndFor;

import java.util.Scanner;

public class whileAndFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()) {
            System.out.print("Write your name: ");
            name = scanner.nextLine();
        }
        scanner.close();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Happy new year , 2024 !");
    }

}
