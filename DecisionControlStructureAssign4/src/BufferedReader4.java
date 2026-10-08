import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader4{
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();


            System.out.print("Enter your Code: ");
            char recommendation;
            recommendation = reader.readLine().charAt(0);


            if (recommendation == 'R'){
                System.out.print("You are a Recommendee of the Jedi Master Obi Wan. \nWelcome to Jedi Knight Military Academy. ");
                return;
            } else if (recommendation == 'N') {

                System.out.print("Enter your citizenship: ");
                char citizenship;
                citizenship = reader.readLine().charAt(0);

                if (citizenship == 'C'){

                    System.out.print("Enter Your Height: ");
                    double height = Double.parseDouble(reader.readLine());

                    System.out.print("Enter your age: ");
                    int age = Integer.parseInt(reader.readLine());

                    if (height >= 200 && age >= 21 && age <= 25 ){
                        System.out.print("You are accepted. \nWelcome to Jedi Knight Military Academy ");
                    } else
                        System.out.print("Im sorry but your application have been Rejected. ");

                } else if (citizenship == 'N'){
                    System.out.print("Im sorry but your application have been rejected. ");
                } else{
                    System.out.print("Invalid Input. ");
                }
                }




    }
}

