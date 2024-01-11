package nestedLoops;

import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        System.out.print("Enter the symbol: ");
        String symbol = scanner.next();

        for(int i = 1; i <= rows; i++){
            System.out.println("");
            for(int j = 1 ; j <= columns; j++){
                System.out.print(symbol);
            }
        }

        scanner.close();
    }
}
