package MINI_PROJECTS.inventory_management;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean true_or_not = true;

        // WHILE
        while (true_or_not) {

            // MAIN MENU
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("                               INVENTORY MANAGER\n");
            System.out.println("                                    MENU:\n\n");
            System.out.println("     ENTER ITEMS");
            System.out.println("     1. Enter Food| 2. Enter Electronics | 0.CLOSE PROGRAM:\n");
            System.out.println("     SEE ITEMS");
            System.out.println("     3. See Food| 4. See Electronics|\n");
            System.out.println("     CHANGE ITEMS QUANTITY");
            System.out.println(
                    "     5. Change Quantity Food| 6. Change Quantity Electronics|\n");
            System.out.println("     CHANGE ITEMS PRICE");
            System.out.println("     7. Change Price Food| 8. Change Price Electronics|\n");
            System.out.println("     DELETE ITEMS");
            System.out.println("     9. Delete Food| 10. Delete Electronics|\n");
            System.out.print("     Enter your choose: ");
            int enter_choose = scanner.nextInt();

            switch (enter_choose) {
                case 0:
                    true_or_not = false;
                    break;

                // ENTER FOOD
                case 1:
                    Food.addFood();
                    break;

                // ADD ELECTRONICS
                case 2:
                    Electronics.addElectronic();
                    break;

                // SEE FOOD
                case 3:
                    Food.seeFood();
                    break;

                // SEE ELECTRONICS
                case 4:
                    Electronics.seeElectronics();
                    break;

                // CHANGE FOOD QUANTITY
                case 5:
                    Food.changeFoodQuantity();
                    break;

                // CHANGE ELECTRONICS QUANTITY
                case 6:
                    Electronics.changeElectronicsQuantity();
                    break;

                // CHANGE FOOD PRICE
                case 7:
                    Food.changeFoodPrice();
                    break;

                // CHANGE ELECTRONICS PRICE
                case 8:
                    Electronics.changeElectronicsPrice();

                default:
                    break;
            }
        }
        scanner.close();
    }
}
