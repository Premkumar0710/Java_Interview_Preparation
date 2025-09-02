package JavaFundamentals.OOPS.Encapsulation;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Only getter for accountNumber (read-only)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter and Setter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Only getter for balance (no setter → controlled access)
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double depositAmount) {
        if(depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposited: " + depositAmount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amountRequested) {
        if(balance >= amountRequested) {
            balance -= amountRequested;
            System.out.println("Withdrawn: " + amountRequested);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Show balance (simulating account verification)
    public void showBalance(String inputAccNumber) {
        if(this.accountNumber.equals(inputAccNumber)) {
            System.out.println("Current balance for " + accountHolderName + ": " + balance);
        } else {
            System.out.println("Invalid account number");
        }
    }
}
