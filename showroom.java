import java.util.Scanner;

class Vehicle {
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }

}

public class showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Car 1:");
        System.out.print("Brand: ");
        String brand1 = scanner.nextLine();
        System.out.print("Model: ");
        String model1 = scanner.nextLine();
        System.out.print("Year: ");
        int year1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Fuel Type: ");
        String fuelType1 = scanner.nextLine();
        System.out.println("--------Car 1 Details:--------");
        Car car1 = new Car(brand1, model1, year1, fuelType1);
        car1.displayDetails();

        scanner.close();

    }
}
