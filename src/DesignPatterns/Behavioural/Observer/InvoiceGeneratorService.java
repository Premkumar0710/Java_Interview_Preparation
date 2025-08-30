package DesignPatterns.Behavioural.Observer;

public class InvoiceGeneratorService implements OnOrderPlacedSubscriber{
    @Override
    public void announceOrderPlaced() {
        System.out.println("Invoice generator service will do its job if subscribed");
    }
}
