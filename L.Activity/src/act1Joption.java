import javax.swing.JOptionPane;

public class act1Joption {
    public static void main(String[] args){

        int num;
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: " + i + ": "));
            if (num > highest){
                highest = num;
            } if (num < lowest){
                lowest = num;
            }
        } JOptionPane.showMessageDialog(null, String.format("Highest Number: %d\n Lowest Number: %d\n" ,highest,lowest)); ;
    }
}
