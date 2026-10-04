import java.util.Scanner;

public class ScannerAssignment1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.print( year + " is a Leap Year");
        } else {
            System.out.print( year + "is not a Leap Year");
        }

        scanner.close();

    }
}
