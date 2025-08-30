package DesignPatterns.Structural.Adapter.Adapter;

import DesignPatterns.Structural.Adapter.BankAPI;
import DesignPatterns.Structural.Adapter.ThirdPartyAPIs.ICICIBank;

public class ICICIBankAdapter implements BankAPI {

    ICICIBank iciciBank = new ICICIBank();
    @Override
    public void registerUser(String accountNumber) {

    }

    @Override
    public void sendMoney(String from, String to, int money) {
        iciciBank.transferMoney(money, to, from);
    }

    @Override
    public void checkBalance(String accountNumber, int pinNumber) {

    }
}
