package JavaFundamentals.OOPS.Polymorphism;

public class UPIPayment extends Payment{
    @Override
    String makePayment(double amount) {
        return "Processing UPI Payment of Rs." + amount;
    }
}
