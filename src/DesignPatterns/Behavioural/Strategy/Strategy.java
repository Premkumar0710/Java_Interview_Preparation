package DesignPatterns.Behavioural.Strategy;

public class Strategy {

    private Payment paymentStrategy;

    public void setPayment(Payment paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void payAmount(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment strategy selected!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
