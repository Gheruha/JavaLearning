package OOP.todos;

import java.util.ArrayList;

public class Todos {
    String todo;

    ArrayList<String> todos = new ArrayList<String>();

    void addTodo(String newTodo) {
        todos.add(newTodo);
    }

    void removeTodo(int id) {
        todos.remove(id - 1);
    }

    void showTodos() {
        int size = todos.size();
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + todos.get(i));
        }
    }
}
