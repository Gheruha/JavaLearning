package firstGUIapp;

import javax.swing.JOptionPane;

public class firstGUI {
    public static void main(String[] args) {
        // Initialize text input
        String name = JOptionPane.showInputDialog("Enter your name:");

        // Initialize text input
        // Since I need it to be integer , it will not work , java expects a string. But
        // I can convert it in integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight: "));

        JOptionPane.showMessageDialog(null,
                "Your name is " + name + "\nYour age is " + age + "\nAnd your weight is " + weight);
    }
}
