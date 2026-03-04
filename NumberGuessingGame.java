//week 4 activity 1
//ct100/g/21350/24
//ERIC MAINA
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Generate random number between 1 and 20
        int secretNumber = (int)(Math.random() * 20) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 20. Can you guess it?");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congratulations!");
                System.out.println("Total attempts: " + attempts);
            }
        }
        input.close();
    }
}
