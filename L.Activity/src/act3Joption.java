import javax.swing.JOptionPane;

public class act3Joption {
    public static void main(String[] args) {

        double balance = 20000.00;
        double amount;

        do {
            amount = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "Current Balance: P" + String.format("%.2f", balance)
                                    + "\nEnter amount (0 to stop):")
            );

            if (amount > 0) {

                balance += amount;

            } else if (amount < 0) {

                if (balance >= Math.abs(amount)) {
                    balance += amount;
                } else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                }
            }

            if (amount != 0) {
                JOptionPane.showMessageDialog(null,
                        String.format("Outstanding Balance: P%.2f", balance));
            }

        } while (amount != 0);

        JOptionPane.showMessageDialog(null, "Transactions terminated!");
    }
}