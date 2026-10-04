import javax.swing.JOptionPane;

public class JoptionAssignment1 {
    public static void main(String[] args){

        int year = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter a Year: "));

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            JOptionPane.showMessageDialog(null, year + " is a Leap Year"); }
        else {
            JOptionPane.showMessageDialog(null, year + " is not a Leap Year");
        }


    }
}
