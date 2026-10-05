import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class BufferedReader2{
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter Your Name: ");
        String name = reader.readLine();

        try {

            System.out.print("Enter your Hourly Rate: ");
            double hourRate = Double.parseDouble(reader.readLine());

            System.out.print("Enter Your Hours Worked: ");
            double hourWorked = Double.parseDouble(reader.readLine());

            double grosspay = hourRate * hourWorked;
            double withholdingRate;

            if ((grosspay <= 2000)) {
                withholdingRate = .10;
            } else if (grosspay <= 4000) {
                withholdingRate = .12;
            } else if (grosspay <= 10000) {
                withholdingRate = .15;
            } else {
                withholdingRate = .20;
            }

            double withholdingtax = grosspay * withholdingRate;
            double netpay = grosspay - withholdingtax;


            System.out.println("----PAYSLIP----");
            System.out.println(name);
            System.out.printf("Your Grosspay is %.2f%n", grosspay);
            System.out.printf("Your Withholding tax is %.2f%n", withholdingtax);
            System.out.printf("Your Netpay is %.2f%n", netpay);

        } catch (NumberFormatException e){
            System.out.print("Invalid Input, Please Put in a real number");
        }

    }
}
