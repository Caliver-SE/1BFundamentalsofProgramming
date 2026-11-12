import java.util.Arrays; // Para magamit ang Arrays.deepToString()

public class Array1 { // Main class
    public static void main(String[] args) { // Simula ng program

        // Gumagawa ng 2D array na may mga pangalan.
        String[][] seats = {
                {"Alice", "Bob", "Charlie"}, // Unang row
                {"David", "Emma", "Frank"}   // Ikalawang row
        };

        // Ipinapakita si Frank (row 2, column 3).
        System.out.println(seats[1][2]);

        // Pinapalitan si Bob ng Vacant.
        seats[0][1] = "Vacant";

        // Ipinapakita ang buong seating arrangement.
        System.out.println(Arrays.deepToString(seats));

    } // Katapusan ng main method
} // Katapusan ng class