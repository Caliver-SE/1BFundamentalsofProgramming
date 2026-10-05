import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = scanner.next();

        try {

            System.out.print("How much is your hourly rate? ");
            double hourRate = scanner.nextDouble();

            System.out.print("How many hours have you worked?");
            double hourWork = scanner.nextDouble();


            double grosspay = hourRate * hourWork;
            double withholdingRate;

            if ((grosspay <= 2000)) {
                withholdingRate = 0.1;
            } else if (grosspay <= 4000) {
                withholdingRate = 0.12;
            } else if (grosspay <= 10000) {
                withholdingRate = 0.15;
            } else {
                withholdingRate = 0.2;
            }

            double withholdingtax = grosspay * withholdingRate;
            double Netpay = grosspay - withholdingtax;

            System.out.println("----Payslip-----");
            System.out.println();
            System.out.println(name);
            System.out.printf("Your Grosspay is %.2f%n", grosspay);
            System.out.printf("Your Withholding tax is %.2f%n", withholdingtax);
            System.out.printf("Your Netpay is %.2f%n", Netpay);
        } catch (NumberFormatException e){
            System.out.print("You've Put an Invalid Number, Please Try again");
        }
    }
}
