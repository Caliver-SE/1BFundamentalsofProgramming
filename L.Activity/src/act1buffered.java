import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class act1buffered {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter number " + i + ": ");
            number = Integer.parseInt(reader.readLine());

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        System.out.println("\nHighest Number: " + highest);
        System.out.println("Lowest Number: " + lowest);
    }
}