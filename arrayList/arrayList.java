package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The main diference between Arrays and ArrayList is that I can change the size
        // of the arrayList.
        // You can't include primitive dataTypes in the ArrayList
        ArrayList<String> text = new ArrayList<String>();
        int choice = 9;
        int index = 9;
        String element = "";

        while (choice != 0) {
            System.out
                    .print("\n0.Exit| 1.Add element| 2.Remove Element| 3.Set(Change) Element| 4.See elements. Choose:");
            choice = scanner.nextInt();
            // Clear the scanner
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Write your element: ");
                    element = scanner.nextLine();
                    text.add(element);
                    break;

                case 2:
                    System.out.println("Index of element to remove: ");
                    index = scanner.nextInt();
                    text.remove(index);
                    break;

                case 3:
                    System.out.print("Index of element to change: ");
                    index = scanner.nextInt();
                    // Clear the scanner
                    scanner.nextLine();
                    System.err.print("Write the new element: ");
                    element = scanner.nextLine();
                    text.set(index, element);
                    break;

                case 4:
                    System.out.print(text);
                    break;
            }

        }
    }
}
