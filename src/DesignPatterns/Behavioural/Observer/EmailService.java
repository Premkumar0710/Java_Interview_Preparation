package DesignPatterns.Behavioural.Observer;

public class EmailService implements OnOrderPlacedSubscriber{
    @Override
    public void announceOrderPlaced() {
        System.out.println("Email service will do its job if subscribed");
    }
}
