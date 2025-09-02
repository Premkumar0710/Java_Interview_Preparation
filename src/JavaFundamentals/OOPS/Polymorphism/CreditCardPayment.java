package JavaFundamentals.OOPS.Polymorphism;

public class CreditCardPayment extends Payment{
    @Override
    String makePayment(double amount) {
        return "Processing Credit Card Payment of Rs." + amount;
    }
}
