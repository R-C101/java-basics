
import javax.swing.JOptionPane;

public class temp {

    public static void main(String[] args) {

        String Name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello " + Name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));

        JOptionPane.showMessageDialog(null, "you are " + age + " years old");
        JOptionPane.showMessageDialog(null, "you are " + age + " years old");


        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null, "you are " + height + " cm tall ");
        
    }
    
}