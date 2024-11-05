public class PaymentProcessingSystem {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment("1234567812345678", "John Doe", "12/25", "123");
        PaymentMethod paypal = new PayPalPayment("john.doe@example.com");
        PaymentMethod bankTransfer = new BankTransferPayment("987654321", "Bank of Example");

        // Process payments
        creditCard.processPayment(100.00);
        paypal.processPayment(50.00);
        bankTransfer.processPayment(200.00);

        // Print payment details
        System.out.println("Credit Card Details: " + creditCard.getPaymentDetails());
        System.out.println("PayPal Email: " + paypal.getPaymentDetails());
        System.out.println("Bank Transfer Details: " + bankTransfer.getPaymentDetails());

        // Process refunds
        creditCard.refund(100.00);
        paypal.refund(50.00);
        bankTransfer.refund(200.00);
    }
}
