// Transaction.java

public class Transaction {
    private Account sourceAccount;
    private Account destinationAccount;
    private double amount;

    public Transaction(Account sourceAccount, Account destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    public void executeTransaction() {
        if (sourceAccount.getBalance() >= amount) {
            sourceAccount.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction failed: Insufficient funds");
        }
    }
}
