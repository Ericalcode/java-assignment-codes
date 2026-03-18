//ERIC MAINA
//Ct100/g/21350/24
//store system

class Product {
    private String productId, name;
    private double price;
    private int quantityInStock;

    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId; this.name = name;
        this.price = price; this.quantityInStock = quantity;
    }

    public String getProductId() { return productId; }
    public int getQuantity() { return quantityInStock; }
    public void updatePrice(double newPrice) { this.price = newPrice; }

    public void sell(int q) {
        if (q <= quantityInStock) quantityInStock -= q;
    }

    public void restock(int q) { quantityInStock += q; }

    public void displayProduct() {
        System.out.println(name + " (ID: " + productId + ") - Price: $" + price + " - Stock: " + quantityInStock);
    }
}

class Store {
    private Product[] inventory = new Product[10];
    private int count = 0;

    public void addProduct(Product p) { if (count < 10) inventory[count++] = p; }

    public void sellProduct(String id, int q) {
        for (int i = 0; i < count; i++) {
            if (inventory[i].getProductId().equals(id)) inventory[i].sell(q);
        }
    }

    public void listLowStock() {
        System.out.println("--- Low Stock Alert ---");
        for (int i = 0; i < count; i++) {
            if (inventory[i].getQuantity() < 10) inventory[i].displayProduct();
        }
    }
}

public class StoreSystem {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("P1", "Laptop", 1200, 15));
        store.addProduct(new Product("P2", "Mouse", 25, 5));
        store.addProduct(new Product("P3", "Keyboard", 45, 12));
        store.addProduct(new Product("P4", "USB Drive", 15, 8));

        store.sellProduct("P1", 10); // Becomes 5
        store.sellProduct("P3", 2);  // Becomes 10
        
        store.listLowStock();
    }
}
