//|week2 task 1|
//ERIC MAINA                
//REGNO:ct100/g/21350/24



import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Prompt user for Radius
        System.out.print("Enter the radius of the cylinder: ");
        double r = input.nextDouble();

        // Prompt user for Height
        System.out.print("Enter the height of the cylinder: ");
        double h = input.nextDouble();

               double volume = Math.PI * Math.pow(r, 2) * h;

        
        double surfaceArea = (2 * Math.PI * Math.pow(r, 2)) + (2 * Math.PI * r * h);

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);

        // Close the scanner
        input.close();
    }
}
