//WEEK3 task 2
//ERIC MAINA
//REG no.:ct100/g/21350/24
import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter water units consumed: ");
        double units = scanner.nextDouble();
        double totalBill = 0;

        // Tiered logic for calculation
        if (units <= 30) {
            totalBill = units * 20;
        } else if (units <= 60) {
            // Units 0-30 at 20, remaining at 25
            totalBill = (30 * 20) + ((units - 30) * 25);
        } else {
            // Units 0-30 at 20, 31-60 at 25, remaining at 30
            totalBill = (30 * 20) + (30 * 25) + ((units - 60) * 30);
        }

        System.out.printf("Total water bill: %.2f KES%n", totalBill);
        
        scanner.close();
    }
}
