package DesignPatterns.Behavioural.Strategy;

public class UPI implements Payment{

    private String UPINumber;
    public UPI(String UPINumber){
        this.UPINumber = UPINumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Amount : " + amount +" has been payed from "+ UPINumber);

    }
}
