import javax.swing.JOptionPane;

public class JOption3 {
    public static void main(String[] args) {

        String name = new String(JOptionPane.showInputDialog(null, "What is your name?"));

        try {

            int NSAT = Integer.parseInt((JOptionPane.showInputDialog(null, "Enter your NSAT score: ")));
            double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your parent's salary: "));
            int EScore = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Exam Score: "));

            JOptionPane.showMessageDialog(null, "Hello " + name);

            if (NSAT < 90 && salary > 10000 && EScore < 85) {
                JOptionPane.showMessageDialog(null, "You are not Eligible for this Scholarship. ");
            } else if (NSAT >= 91 && salary <= 3500 && EScore >= 91) {
                JOptionPane.showMessageDialog(null, "You are Eligible for this scholarship. ");
            } else {
                JOptionPane.showMessageDialog(null, "Your application will subjected for futher study. ");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You've put an Invalid Number, please try again ");
        }
    }
}