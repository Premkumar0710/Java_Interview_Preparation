package DesignPatterns.Structural.Adapter.ThirdPartyAPIs;

public class ICICIBank {
    public void transferMoney(int money,String to , String from){
        System.out.println("Money transferred from ICICI bank");
    }
}
