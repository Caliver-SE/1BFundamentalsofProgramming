import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.next();

        try {

            System.out.print("Enter your NSAT score: ");
            int NSAT = scanner.nextInt();

            System.out.print("Enter your Parent's Salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Enter your Entrance Exam Score: ");
            int EScore = scanner.nextInt();

            System.out.println("Hello " + name);

            if (NSAT < 90 && salary > 10000 && EScore < 85){
                System.out.print("You are not Eligible for this Scholarship. ");
            } else if (NSAT >= 91 && salary <= 3500 && EScore >= 91){
                System.out.print("You are Eligible for this Scholarship. ");
            } else{
                System.out.print("Your application will be subjected for further study");
            }

        } catch (NumberFormatException e){
            System.out.print("You've Put an Invalid Number, Please Try again");
        }
    }
}