import javax.swing.JOptionPane;

public class JOption2 {
    public static void main(String[] args){

        String name = new String (JOptionPane.showInputDialog(null, "What is your name?"));

        try {

            double hourRate = Double.parseDouble((JOptionPane.showInputDialog(null, "Enter Your Hourly Rate: ")));
            double hourWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Your Hours Worked: "));

            double grosspay = hourRate * hourWorked;
            double withholdingRate;

            if (grosspay <= 2000) {
                withholdingRate = 0.1;
            } else if (grosspay <= 4000) {
                withholdingRate = 0.12;
            } else if (grosspay <= 10000) {
                withholdingRate = 0.15;
            } else {
                withholdingRate = 0.20;
            }

            double withholdingtax = grosspay * withholdingRate;
            double Netpay = grosspay - withholdingtax;

            JOptionPane.showMessageDialog(null, String.format("Hello %s!", name));
            JOptionPane.showMessageDialog(null, String.format(
                    "Your Grosspay is %.2f%n" + "Your Withholding Tax is %.2f%n" + "Your Netpay is %.2f%n",
                    grosspay, withholdingtax, Netpay));
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "You've input an Invalid Number, Please Try again");
        }

    }
}
