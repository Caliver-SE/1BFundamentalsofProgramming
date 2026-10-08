import java.util.Scanner;
public class Scanner4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your code: ");
        char recommendation;
        recommendation = scanner.nextLine().charAt(0);

        if (recommendation == 'R') {
            System.out.print("You are a recommendee of the Jedi Master Obi Wan. \nWelcome to the Jedi Knight Military Academy. ");
        } else if (recommendation == 'N'){

            System.out.print("Enter your Citizenship: ");
            char citizenship;
            citizenship = scanner.nextLine().charAt(0);

            if (citizenship == 'C'){

                System.out.print("Enter your Height: ");
                double height = scanner.nextDouble();

                System.out.print("Enter your Age: ");
                int age = scanner.nextInt();

                if (height >= 200 && age >= 21 && age <= 25){
                    System.out.print("Your Application was accepted. \nWelcome to Jedi Knight Military Academy. ");
                } else {
                    System.out.print("I'm sorry your application have been Rejected");
                }
            } else if (citizenship == 'N') {
                System.out.print("I'm sorry but your application have been Rejected. ");
            } else {
                System.out.print("Invalid Input, please try again. ");
            }
        } else {
            System.out.print("Invalid Input, please try again. ");
        }
    }

}
