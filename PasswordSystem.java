//week 4 activity 2
//ERIC MAINA
//ct100/g/21350/24

import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = input.next();
            
            if (!password.equals("1234")) {
                System.out.println("Incorrect. Try again.");
            }
            
        } while (!password.equals("1234"));

        System.out.println("Access Granted");
        input.close();
    }
}
