import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class BufferedReader3{
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter Your Name: ");
        String name = reader.readLine();

        try {

            System.out.print("Enter your NSAT score: ");
            int NSAT = Integer.parseInt(reader.readLine());

            System.out.print("Enter your Parent's Salary: ");
            double Salary = Double.parseDouble(reader.readLine());

            System.out.print("Enter your Entrance Exam Score: ");
            int EScore = Integer.parseInt(reader.readLine());

            System.out.println("Hello " + name);

            if ((NSAT < 90 && Salary > 10000 && EScore < 85)) {
                System.out.print("You are Not Eligible for Scholarship");
            } else if (NSAT >= 91 && Salary <= 3500 && EScore >= 91){
                System.out.print("You are Eligible for this Scholarship. ");
            } else {
                System.out.print("Your application will be subjected for further study");
            }

        } catch (NumberFormatException e){
            System.out.print("Invalid Input, Please Put in a real number");
        }

    }
}
