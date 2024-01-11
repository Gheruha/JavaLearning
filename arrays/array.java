package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many elements do you want in the array: ");
        int x = scanner.nextInt();

        // Declare the array
        int[] numbers = new int[x];

        // Loop the array to write
        for (int i = 0; i < x; i++) {
            System.out.print("[" + (i + 1) + "]:");
            numbers[i] = scanner.nextInt();
        }

        // Using Array.toString to display the array without looping it.
        System.out.println("Your array :" + Arrays.toString(numbers));
    }
}
