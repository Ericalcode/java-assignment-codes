//Eric Maina
//ct100/g/21350/24
public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize all attributes
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Accessors (Getters)
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    // Mutators (Setters)
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }

    // Logic Methods
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for " + accountHolder);
        }
    }

    public double checkBalance() { return balance; }

    public void displayAccountInfo() {
        System.out.println("Acc: " + accountNumber + " | Holder: " + accountHolder + " | Balance: $" + balance);
    }
}
