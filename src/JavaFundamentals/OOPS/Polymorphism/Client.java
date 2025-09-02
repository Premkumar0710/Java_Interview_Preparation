package JavaFundamentals.OOPS.Polymorphism;

public class Client {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        System.out.println(p1.makePayment(2000));

        Payment p2 = new UPIPayment();
        System.out.println(p2.makePayment(500));

        Payment p3 = new CreditCardPayment();
        System.out.println(p3.validateDetails("1234-5678-9876", "12/26"));

        Payment p4 = new UPIPayment();
        System.out.println(p4.validateDetails("user@upi"));
    }
}
