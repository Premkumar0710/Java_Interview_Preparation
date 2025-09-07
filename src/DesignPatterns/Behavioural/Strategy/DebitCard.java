package DesignPatterns.Behavioural.Strategy;

public class DebitCard implements Payment{

    private String cardNumber;
    public DebitCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Amount : " + amount +" has been payed from "+ cardNumber);

    }
}
