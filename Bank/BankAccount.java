package Bank;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0;
    }

    public void deposit(double amount) throws Bank.InvalidTransactionException {
        if (amount <= 0)
            throw new Bank.InvalidTransactionException("Deposit amount must be positive.");
        balance += amount;
    }

    public void withdraw(double amount) throws Bank.InvalidTransactionException, Bank.InsufficientFundsException {
        if (amount <= 0)
            throw new Bank.InvalidTransactionException("Withdraw amount must be positive.");
        if (amount > balance)
            throw new Bank.InsufficientFundsException("Insufficient balance.");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDetails() {
        return accountNumber + " - " + holderName + ": Rs. " + balance;
    }
}