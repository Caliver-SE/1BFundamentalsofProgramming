
public class Array2 {
    public static void main(String[] args) {

        // Nagde-declare at gumagawa ng double array na may eksaktong 5 elemento.
        double[] temperatures = new double[5];

        // Nilalagyan ng value ang unang araw (index 0).
        temperatures[0] = 32.5;

        // Nilalagyan ng value ang ikalawang araw (index 1).
        temperatures[1] = 34.0;

        // Nilalagyan ng value ang ikatlong araw (index 2).
        temperatures[2] = 31.8;

        // Nilalagyan ng value ang ikaapat na araw (index 3).
        temperatures[3] = 33.2;

        // Nilalagyan ng value ang ikalimang araw (index 4).
        temperatures[4] = 35.1;

        // Nagpi-print ng heading para sa listahan ng temperatures.
        System.out.println("Temperatures for 5 Days:");

        // Gumagamit ng for loop para ulitin ang pag-print ng bawat elemento.
        // Ang temperatures.length ay nagbibigay ng kabuuang bilang ng elemento (5).
        for (int i = 0; i < temperatures.length; i++) {

            // Ipinapakita ang araw at ang katumbas nitong temperature.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }

        // Ina-update ang temperature ng ikatlong araw mula 31.8 papuntang 32.0.
        temperatures[2] = 32.0;

        // Nagpi-print ng heading para sa updated temperature.
        System.out.println("\nUpdated Temperature:");

        // Ipinapakita ang bagong temperature ng ikatlong araw.
        System.out.println("Day 3: " + temperatures[2]);
    }
}
