package DesignPatterns.Structural.Adapter;

public interface BankAPI {
    void registerUser(String accountNumber);
    void sendMoney(String from, String to, int money);
    void checkBalance(String accountNumber, int pinNumber);
}
