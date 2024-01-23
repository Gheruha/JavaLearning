package MINI_PROJECTS.inventory_management;

public class Item {

    // Private characteristcs of the items.
    private int id;
    private String name;
    private int quantity;
    private double price;

    // CONSTRUCTOR
    Item(int id, String name, int quantity, double price) {
        this.set_id(id);
        this.set_name(name);
        this.set_quantity(quantity);
        this.set_price(price);
    }

    // GETTERS
    public int get_id() {
        return id;
    }

    public String get_name() {
        return name;
    }

    public int get_quantity() {
        return quantity;
    }

    public double get_price() {
        return price;
    }

    // SETTERS
    public void set_id(int id) {
        this.id = id;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_quantity(int quantity) {
        this.quantity = quantity;
    }

    public void set_price(double price) {
        this.price = price;
    }
}