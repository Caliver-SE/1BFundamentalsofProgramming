import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bthirdJava {
    public static void main(String[] args){

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        String name = "Please input your name";
        System.out.print("Input");
        try{
            name = dataln.readLine();
        }catch (IOException e){
            System.out.println("Error");}
        System.out.println("Hello" + name + "!");
    }
}
