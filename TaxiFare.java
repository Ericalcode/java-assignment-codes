//week5 Q2
//Eric Maina
//ct100/g/21350/24

import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance traveled (in km): ");
        double distance = input.nextDouble();
        System.out.println("Total Fare: KSh. " + calculateFare(distance));
        input.close();
    }

    public static double calculateFare(double distance) {
        return distance * 50;
    }
}
