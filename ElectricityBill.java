//week 5 Q1
//ERIC MAINA
//ct100/g/21350/24
public class ElectricityBill {
    public static void main(String[] args) {
        System.out.println("Total Bill: KSh. " + calculateElectricBill(250));
    }

    public static double calculateElectricBill(int units) {
        double bill = 0;
        if (units <= 100) {
            bill = units * 10;
        } else if (units <= 200) {
            bill = (100 * 10) + ((units - 100) * 15);
        } else {
            bill = (100 * 10) + (100 * 15) + ((units - 200) * 20);
        }
        return bill;
    }
}
