//week2 task2(optional task)
//ERIC MAINA
REG NO.:ct100/g/21350/24
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        System.out.print("Enter Annual Interest Rate (in %): ");
        double rate = input.nextDouble();

      
        double simpleInterest = (principal * time * rate) / 100;

      
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("\n--- Interest Summary ---");
        System.out.printf("Simple Interest: Sh %.2f%n", simpleInterest);
        System.out.printf("Compound Interest: Sh %.2f%n", compoundInterest);
        System.out.printf("Total Balance (Compound): Sh %.2f%n", amount);

        input.close();
    }
}
