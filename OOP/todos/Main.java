package OOP.todos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Todos user1 = new Todos();
        int choose = 9;

        while (choose != 0) {
            System.out.println("1. Add todo | 2. Delete todo | 3. See Todos | 0. Exit");
            System.out.print("Choice: ");
            choose = in.nextInt();
            in.nextLine(); // Consume the newline character

            switch (choose) {
                case 1:
                    System.out.print("Enter todo: ");
                    String todo = in.nextLine();
                    user1.addTodo(todo);
                    break;

                case 2:
                    System.out.print("Enter todo id to delete: ");
                    int idToDelete = in.nextInt();
                    in.nextLine(); // Consume the newline character
                    user1.removeTodo(idToDelete);
                    break;

                case 3:
                    user1.showTodos();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.err.println("Wrong choice.");
            }
        }

        in.close(); // Close the Scanner object when done
    }
}
