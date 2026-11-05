import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class act2buffered {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i += 2) {

            System.out.print(i + " ");

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
