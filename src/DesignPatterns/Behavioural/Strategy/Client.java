package DesignPatterns.Behavioural.Strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        strategy.setPayment(new CreditCard("3024"));
        strategy.payAmount(500);
        
        /*
        Think of payment in an e-commerce app:
        A customer can pay by Credit Card, PayPal, or UPI.
        Instead of hardcoding all logic in one class with if (paymentType == "UPI") {...}, we define a strategy interface and multiple concrete strategies.
        At runtime, the system chooses which payment strategy to use.
        */
    }
}
