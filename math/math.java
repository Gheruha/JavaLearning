package math;

import javax.swing.JOptionPane;

public class math {
    public static void main(String[] args) {

        // Here I ask for a number. Using JOptionPane fot the textfield
        // Also I convert the JOption from a string to a double
        double a = Double
                .parseDouble(JOptionPane.showInputDialog("Enter 'a' value to find the hypotenuse of the triangle:"));

        double b = Double
                .parseDouble(JOptionPane.showInputDialog("Enter 'b' value to find the hypotenuse of the triangle:"));

        // Founding the hypotenuse
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        JOptionPane.showMessageDialog(null, "The hypotenuse is: " + c);
    }

}
