package DesignPatterns.Behavioural.Strategy;

public class CreditCard implements Payment{
    private String cardNumber;
    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Amount : " + amount +" has been payed from "+ cardNumber);
    }
}
