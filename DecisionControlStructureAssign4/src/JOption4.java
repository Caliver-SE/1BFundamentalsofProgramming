import javax.swing.JOptionPane;
import java.awt.*;

public class JOption4 {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog(null, "Enter Your Name: ");

        char recommendation;
        recommendation = JOptionPane.showInputDialog(null, "Enter Your Code: ").charAt(0);

        if (recommendation == 'R'){
            JOptionPane.showMessageDialog(null, "You are a recommendee of the Jedi master Obi Wan. \nWelcome to Jedi Knight Military Academy");
        } else if (recommendation == 'N'){

            char citizenship;
            citizenship = JOptionPane.showInputDialog(null, "Enter your citizenship").charAt(0);

            if (citizenship == 'C'){

                double height = Double.parseDouble((JOptionPane.showInputDialog(null, "Enter your Height")));
                int age = Integer.parseInt((JOptionPane.showInputDialog(null, "Enter your Age")));


                if (height >= 200 && age >= 21 && age <= 25){
                    JOptionPane.showMessageDialog(null, "Your application have been Accepted. \n Welcome to Jedi Knight Military Academy!!");
                } else{
                    JOptionPane.showMessageDialog(null, "Your Application have been Rejected. ");
                }
            } else if ( citizenship == 'N'){
                JOptionPane.showMessageDialog(null, "Your application have been rejected.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input, please try again");
            }


        }else {
            JOptionPane.showMessageDialog(null, "Invalid Input, Please try again. ");
        }
    }
}
