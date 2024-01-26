package MINI_PROJECTS.inventory_management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Electronics extends Item {

    Electronics(int id, String name, int quantity, double price, String quantityMeasure) {
        super(id, name, quantity, price, quantityMeasure);
    }

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Electronics> electronicsList = new ArrayList<>();

    // ADD ELECTRONICS
    public static void addElectronic() {
        while (true) {
            System.out.println(
                    "-------------------------------------------------------------------------------------");
            System.out.print("     Enter electronic ID (or -1 to stop): ");
            int electronicId = scanner.nextInt();

            // Check if the user wants to stop
            if (electronicId == -1) {
                break;
            }

            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("     Enter electronic name: ");
            String electronicName = scanner.nextLine();

            System.out.print("     Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("     Enter price: ");
            double price = scanner.nextDouble();

            scanner.nextLine(); // Consume the newline character left by nextDouble()

            // Create a new Food object using user input and add it to the list
            Electronics electronic = new Electronics(electronicId, electronicName, quantity, price, "pieces");
            electronicsList.add(electronic);
        }
    }

    // SEE ELECTRONICS
    public static void seeElectronics() {
        System.out.println(
                "-------------------------------------------------------------------------------------");
        System.out.println("                                  ELECTRONICS LIST\n\n");
        for (Electronics electronic : electronicsList) {
            System.out.println("     Electronic ID: " + electronic.get_id());
            System.out.println("     Electronic Name: " + electronic.get_name());
            System.out.println("     Quantity: " + electronic.get_quantity());
            System.out.println("     Price: " + electronic.get_price() + "$");
            System.out.println("     Quantity Measure: " + electronic.get_quantitityMeasure());
            System.out.println(
                    "-------------------------------------------------------------------------------------");
        }
    }

    // CHANGE ELECTRONICS QUANTITY
    public static void changeElectronicsQuantity() {
        System.out.println(
                "-------------------------------------------------------------------------------------");
        System.out.println("                      CHANGE QUANTITY ELECTRONICS\n\n");
        System.out.print("     Enter the ID of the electronic item whose quantity you want to change: ");
        int electronicId = scanner.nextInt();

        // FIND FOOD ITEM , ADD OR DELETE
        for (Electronics electronic : electronicsList) {
            if (electronic.get_id() == electronicId) {
                while (true) {
                    System.out.println("\n     YOU SELECTED: " + electronic.get_name() + ". CURRENT QUANTITY: "
                            + electronic.get_quantity() + electronic.get_quantitityMeasure() + "\n");
                    System.out.println("     1.Add quantity| 2.Delete quantity| 0.CLOSE QUANTITY CHANGE\n");
                    System.out.print("     Enter choice: ");
                    int choice = scanner.nextInt();

                    // Check if the user wants to exit.
                    if (choice == 0) {
                        break;
                    }

                    // Add quantity
                    if (choice == 1) {
                        System.out.print("     How many " + electronic.get_quantitityMeasure() + " to add: ");
                        double quantityToAdd = scanner.nextDouble();
                        electronic.add_quantity(quantityToAdd);
                        System.out.println(
                                "     CURRENT QUANTITY: " + electronic.get_quantity()
                                        + electronic.get_quantitityMeasure());
                    }

                    // Delete quantity
                    else if (choice == 2) {
                        System.out.print("     How many " + electronic.get_quantitityMeasure() + " to Delete: ");
                        double quantityToDelete = scanner.nextDouble();
                        electronic.delete_quantity(quantityToDelete);
                        System.out.println(
                                "     CURRENT QUANTITY: " + electronic.get_quantity()
                                        + electronic.get_quantitityMeasure());
                    }
                }
            }
        }
    }

    // CHANGE ELECTRONIC PRICE
    public static void changeElectronicsPrice() {
        System.out.println(
                "-------------------------------------------------------------------------------------");
        System.out.println("                             CHANGE PRICE ELECTRONICS\n\n");
        System.out.print("     Enter the ID of the food item whose price you want to change: ");
        int electronicId = scanner.nextInt();

        // FIND ELECTRONIC ITEM
        for (Electronics electronic : electronicsList) {
            if (electronic.get_id() == electronicId) {
                while (true) {
                    System.out.println("\n     YOU SELECTED: " + electronic.get_name() + ". CURRENT PRICE: "
                            + electronic.get_price() + " $\n");
                    System.out.println("     1.Change Price| 0.CLOSE QUANTITY CHANGE\n");
                    System.out.print("     Enter choice: ");
                    int choice = scanner.nextInt();

                    // Check if the user wants to exit.
                    if (choice == 0) {
                        break;
                    }

                    // Change price
                    if (choice == 1) {
                        System.out.print("     New price: ");
                        double newPrice = scanner.nextDouble();
                        electronic.change_price(newPrice);
                        System.out.println(
                                "     CURRENT PRICE: " + electronic.get_price());
                    }
                }
            }
        }
    }
    // Iterator<Electronics> iterator =
    // electronicsList.iterator();iterator.hasNext();
    // Electronics electronic = iterator.next();

    static void deleteElectronic() {
        System.out.println(
                "-------------------------------------------------------------------------------------");
        System.out.println("                                  DELETE ELECTRONICS\n\n");
        System.out.print("     Enter the ID of the electronic item that you want to delete: ");
        int foodId = scanner.nextInt();

        // FIND FOOD ITEM
        for (Iterator<Electronics> iterator = electronicsList.iterator(); iterator.hasNext();) {
            Electronics electronic = iterator.next();
            if (electronic.get_id() == foodId) {
                while (true) {
                    System.out.println("\n     YOU SELECTED: " + electronic.get_name());
                    System.out.println("     1.Delete item| 0.CLOSE DELETE FOOD\n");
                    System.out.print("     Enter choice: ");
                    int choice = scanner.nextInt();

                    // Check if the user wants to exit.
                    if (choice == 0) {
                        break;
                    }

                    // Change price
                    if (choice == 1) {
                        iterator.remove();
                        break;
                    }
                }
            }
        }
    }
}
