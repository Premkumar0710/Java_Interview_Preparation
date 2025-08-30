package DesignPatterns.Structural.Adapter;

import DesignPatterns.Structural.Adapter.Adapter.YesBankAdapter;

public class PhonePe {

    public static void main(String[] args) {

        BankAPI bankAPI = new YesBankAdapter();
        bankAPI.sendMoney("Prem","Kumar",1000);
    }
}
