package DesignPatterns.Behavioural.Observer;

public class InventoryService implements OnOrderPlacedSubscriber{
    @Override
    public void announceOrderPlaced() {
        System.out.println("Inventory service will do its job if subscribed");
    }
}
