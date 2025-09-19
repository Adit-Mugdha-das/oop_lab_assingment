public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double openingBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
      feature/transaction-history
        if (amount > 1) balance += amount;
main
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; return true; }
        return false;
    }

    public double checkBalance() {
        return balance;
    }
    public double calculateInterest(double ratePercent) {
    // simple interest for one year on current balance
    return (balance * ratePercent) / 100.0;
}

}
