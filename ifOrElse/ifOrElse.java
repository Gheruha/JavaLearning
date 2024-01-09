package ifOrElse;

import java.util.Scanner;

public class ifOrElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are in a boring game :( , press 'q' or 'Q' to quit.");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game!");
        } else {
            System.out.println("Still in that boring game :(");
        }

        scanner.close();
    }
}
