//week3 task3 
//ERIC MAINA
//ct100/g/21350/24


import java.util.Scanner;

public class BundlePurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display Menu
        System.out.println("Select data bundle:");
        System.out.println("1. 100MB @ 50 KES");
        System.out.println("2. 500MB @ 200 KES");
        System.out.println("3. 1GB @ 350 KES");
        System.out.println("4. 2GB @ 600 KES");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        // Process Choice
        switch (choice) {
            case 1:
                System.out.println("You selected 100MB. Cost = 50 KES");
                break;
            case 2:
                System.out.println("You selected 500MB. Cost = 200 KES");
                break;
            case 3:
                System.out.println("You selected 1GB. Cost = 350 KES");
                break;
            case 4:
                System.out.println("You selected 2GB. Cost = 600 KES");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        input.close();
    }
}
