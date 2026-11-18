public class ArrayCoffee { // Pangalan ng class

    public static void main(String[] args) { // Main method ng program

        String[] days = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};
        // Array na naglalaman ng mga araw

        int[] sales = {120, 145, 130, 155, 180, 210, 195};
        // Array ng cups sold bawat araw

        int total = 0; // Panimulang total sales

        int highest = sales[0]; // Initial highest sales
        int lowest = sales[0]; // Initial lowest sales

        String highestDay = days[0]; // Araw ng highest sales
        String lowestDay = days[0]; // Araw ng lowest sales

        System.out.println("JAVA BEANS COFFEE SHOP");
        // I-print ang pangalan ng coffee shop

        for (int i = 0; i < sales.length; i++) {
            // Loop para basahin lahat ng sales

            System.out.println(days[i] + ": " + sales[i] + " cups");
            // Ipakita ang daily sales

            total = total + sales[i];
            // Idagdag ang sales sa total

            if (sales[i] > highest) {
                highest = sales[i]; // I-update ang highest sales
                highestDay = days[i]; // I-save ang araw
            }

            if (sales[i] < lowest) {
                lowest = sales[i]; // I-update ang lowest sales
                lowestDay = days[i]; // I-save ang araw
            }
        }

        double average = (double) total / sales.length;
        // Kunin ang average daily sales

        System.out.println("Total Sales: " + total);
        // Ipakita ang total sales

        System.out.println("Average Sales: " + average);
        // Ipakita ang average sales

        System.out.println("Highest Sales: " + highest);
        // Ipakita ang pinakamataas na sales

        System.out.println("Best Day: " + highestDay);
        // Ipakita ang araw na may highest sales

        System.out.println("Lowest Sales: " + lowest);
        // Ipakita ang pinakamababang sales

        System.out.println("Lowest Sales Day: " + lowestDay);
        // Ipakita ang araw na may lowest sales
    }
}