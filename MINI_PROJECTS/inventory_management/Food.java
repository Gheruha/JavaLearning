package MINI_PROJECTS.inventory_management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Food extends Item {

    Food(int id, String name, int quantity, double price, String quantityMeasure, int quantityToDelete) {
        super(id, name, quantity, price, quantityMeasure);
    }

    static ArrayList<Food> foodList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // ADD FOOD
    public static void addFood() {
        while (true) {
            System.out.println(
                    "-------------------------------------------------------------------------------------");
            System.out.print("     Enter food ID (or -1 to stop): ");
            int foodId = scanner.nextInt();

            // Check if the user wants to stop
            if (foodId == -1) {
                break;
            }

            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("     Enter food name: ");
            String foodName = scanner.nextLine();

            System.out.print("     Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("     Enter price: ");
            double price = scanner.nextDouble();

            scanner.nextLine(); // Consume the newline character left by nextDouble()

            // Create a new Food object using user input and add it to the list
            Food food = new Food(foodId, foodName, quantity, price, "grams", quantity);
            foodList.add(food);
        }
    }

    // SEE FOOD
    public static void seeFood() {
        System.out.println(
                "-------------------------------------------------------------------------------------");
        System.out.println("                                  FOOD LIST\n\n");
        for (Food food : foodList) {
            System.out.println("     Food ID: " + food.get_id());
            System.out.println("     Food Name: " + food.get_name());
            System.out.println("     Quantity: " + food.get_quantity());
            System.out.println("     Price: " + food.get_price() + "$");
            System.out.println("     Quantity Measure: " + food.get_quantitityMeasure());
            System.out.println(
                    "-------------------------------------------------------------------------------------");
        }
    }

    // CHANGE FOOD QUANTITY
    public static void changeFoodQuantity() {
        System.out.println(
                "-------------------------------------------------------------------------------------");
        System.out.println("                     CHANGE QUANTITY FOOD\n\n");
        System.out.print("     Enter the ID of the food item whose quantity you want to change: ");
        int foodId = scanner.nextInt();

        // FIND FOOD ITEM , ADD OR DELETE
        for (Food food : foodList) {
            if (food.get_id() == foodId) {
                while (true) {
                    System.out.println("\n     YOU SELECTED: " + food.get_name() + ". CURRENT QUANTITY: "
                            + food.get_quantity() + food.get_quantitityMeasure() + "\n");
                    System.out.println("     1.Add quantity| 2.Delete quantity| 0.CLOSE QUANTITY CHANGE\n");
                    System.out.print("     Enter choice: ");
                    int choice = scanner.nextInt();

                    // Check if the user wants to exit.
                    if (choice == 0) {
                        break;
                    }

                    // Add quantity
                    if (choice == 1) {
                        System.out.print("     How many " + food.get_quantitityMeasure() + " to add: ");
                        double quantityToAdd = scanner.nextDouble();
                        food.add_quantity(quantityToAdd);
                        System.out.println(
                                "     CURRENT QUANTITY: " + food.get_quantity() + food.get_quantitityMeasure());
                    }

                    // Delete quantity
                    else if (choice == 2) {
                        System.out.print("     How many " + food.get_quantitityMeasure() + " to Delete: ");
                        double quantityToDelete = scanner.nextDouble();
                        food.delete_quantity(quantityToDelete);
                        System.out.println(
                                "     CURRENT QUANTITY: " + food.get_quantity() + food.get_quantitityMeasure());
                    }
                }
            }
        }
    }

    // CHANGE FOOD PRICE
    public static void changeFoodPrice() {
        System.out.println(
                "-------------------------------------------------------------------------------------");
        System.out.println("                               CHANGE PRICE FOOD\n\n");
        System.out.print("     Enter the ID of the food item whose price you want to change: ");
        int foodId = scanner.nextInt();

        // FIND FOOD ITEM
        for (Food food : foodList) {
            if (food.get_id() == foodId) {
                while (true) {
                    System.out.println("\n     YOU SELECTED: " + food.get_name() + ". CURRENT PRICE: "
                            + food.get_price() + " $\n");
                    System.out.println("     1.Change Price| 0.CLOSE QUANTITY CHANGE\n");
                    System.out.print("     Enter choice: ");
                    int choice = scanner.nextInt();

                    // Check if the user wants to exit.
                    if (choice == 0) {
                        break;
                    }

                    // Add quantity
                    if (choice == 1) {
                        System.out.print("     New price: ");
                        double newPrice = scanner.nextDouble();
                        food.change_price(newPrice);
                        System.out.println(
                                "     CURRENT PRICE: " + food.get_price());
                    }
                }
            }
        }
    }

    public static void deleteFood() {
        System.out.println(
                "-------------------------------------------------------------------------------------");
        System.out.println("                                  DELETE FOOD\n\n");
        System.out.print("     Enter the ID of the food item that you want to delete: ");
        int foodId = scanner.nextInt();

        // FIND FOOD ITEM
        for (Iterator<Food> iterator = foodList.iterator(); iterator.hasNext();) {
            Food food = iterator.next();
            if (food.get_id() == foodId) {
                while (true) {
                    System.out.println("\n     YOU SELECTED: " + food.get_name());
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
