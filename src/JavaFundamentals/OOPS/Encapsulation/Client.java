package JavaFundamentals.OOPS.Encapsulation;

public class Client {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("BRO-CODE", "Prem Kumar", 1000);

        acc.deposit(500);
        acc.withdraw(300);

        acc.showBalance("BRO-CODE");  // ✅ Correct account
        acc.showBalance("XYZ123");    // ❌ Wrong account
    }
}
