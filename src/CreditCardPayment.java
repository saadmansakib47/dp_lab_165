public class CreditCardPayment implements PaymentMethodStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
