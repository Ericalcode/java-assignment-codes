//week2 task2 
//ERIC MAINA
//REGNO: ct100/g/21350/24
import java.util.Scanner;

public class BankLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println(" Welcome to the Bank Loan Portal ");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Please enter your annual income (Sh): ");
        double income = scanner.nextDouble();

      
        if (age >= 21 && income >= 21000) {
            System.out.println("Congratulations! You qualify for a loan.");
        } else {
            System.out.println("Unfortunately, we are unable to offer you a loan at this time.");
        }

        scanner.close();
    }
}
