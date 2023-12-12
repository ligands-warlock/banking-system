// BankSystem.java

public class BankSystem {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer(1, "Alice");
        Customer customer2 = new Customer(2, "Bob");

        // Create accounts
        Account account1 = new Account(101, customer1, 1000);
        Account account2 = new Account(102, customer2, 500);

        // Display initial balances
        System.out.println("Initial Balances:");
        account1.displayInfo();
        account2.displayInfo();

        // Perform a transaction
        Transaction transaction = new Transaction(account1, account2, 300);
        transaction.executeTransaction();

        // Display updated balances
        System.out.println("\nUpdated Balances:");
        account1.displayInfo();
        account2.displayInfo();
    }
}
