import javax.swing.*;

public class bsixthJava {
    public static void main(String[] args) {

        //  Variable
        String name;
        String msg = "Hello ";

        name = JOptionPane.showInputDialog("What is your name?");

        JOptionPane.showMessageDialog(null, msg +name + "!");
    }
}
