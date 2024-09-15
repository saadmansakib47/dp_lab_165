public class PaymentMethodFactory {
    public static PaymentMethodStrategy getPaymentMethod(String paymentMethod) {
        switch (paymentMethod.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "digitalwallet":
                return new DigitalWalletPayment();
            default:
                throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        }
    }
}
