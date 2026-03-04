//ERIC MAINA
//REGISTRATION NO.:CT100/G/21350/24
//week 1asignment 2


import java.util.Scanner;


public class Userdetail  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height (e.g., 1.75): ");
        float height = scanner.nextFloat();

      
        System.out.print("Enter your bank balance (Ksh): ");
        double balance = scanner.nextDouble();

        
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.next();

        // Displaying info
        System.out.println("\n--- Collected Information ---");
        System.out.println("Height: " + height + " meters");
        System.out.println("Bank Balance: Ksh " + balance);
        System.out.println("Phone Number: " + phoneNumber);

      
        scanner.close();
    }
}
