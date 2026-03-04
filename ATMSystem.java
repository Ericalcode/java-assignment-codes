//week4 activity 2
//ERIC MAINA
//ct100/g/21350/24
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initial starting balance
        System.out.print("Enter your initial account balance: ");
        double balance = input.nextDouble();

        // Loop runs as long as balance is greater than 0
        while (balance > 0) {
            System.out.print("Enter amount to withdraw: ");
            double withdrawal = input.nextDouble();

            balance -= withdrawal; // Subtract withdrawal from balance

            if (balance > 0) {
                System.out.printf("Withdrawal successful. Current balance: Sh %.2f%n", balance);
            } else {
                System.out.println("Balance reached zero or negative. Account closed.");
            }
        }

        input.close();
    }
}
