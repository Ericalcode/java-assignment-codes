// /CT100/G/21350/24 
//Name:Eric Maina
//week 7
import java.io.*;
import java.util.Scanner;

public class DailySales {
    public static void main(String[] args) {
        double totalSales = 0;
        File file = new File("sales.txt");

        // Use try-with-resources to ensure the file is properly closed (iii)
        try (Scanner fileScanner = new Scanner(file)) {
            // i. Read all transactions
            while (fileScanner.hasNextDouble()) {
                totalSales += fileScanner.nextDouble();
            }
            // ii. Display total
            System.out.println("Total Sales for the day: Kes " + totalSales);
        } catch (FileNotFoundException e) {
            System.out.println("Error: sales.txt not found.");
        }
    }
}
