package JavaFundamentals.OOPS.Polymorphism;

public abstract class Payment {

    // Runtime polymorphism method (to be overridden)
    String makePayment(double amount) {
        return "Processing generic payment of Rs." + amount;
    }

    // Compile-time polymorphism (overloading)
    String validateDetails(String cardNumber, String expiry) {
        return "Validating Card with number: " + cardNumber + " and expiry: " + expiry;
    }

    String validateDetails(String upiId) {
        return "Validating UPI ID: " + upiId;
    }
}
