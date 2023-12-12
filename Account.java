// Account.java

public class Account {
    private int accountId;
    private Customer customer;
    private double balance;

    public Account(int accountId, Customer customer, double balance) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account ID: " + accountId);
        customer.displayInfo();
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
