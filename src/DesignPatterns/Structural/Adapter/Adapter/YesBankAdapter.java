package DesignPatterns.Structural.Adapter.Adapter;

import DesignPatterns.Structural.Adapter.BankAPI;
import DesignPatterns.Structural.Adapter.ThirdPartyAPIs.YesBank;

public class YesBankAdapter implements BankAPI {

    YesBank yesBank = new YesBank();
    @Override
    public void registerUser(String accountNumber) {

    }

    @Override
    public void sendMoney(String from, String to, int money) {
        yesBank.transferMoney(money, to, from);
    }

    @Override
    public void checkBalance(String accountNumber, int pinNumber) {

    }
}
