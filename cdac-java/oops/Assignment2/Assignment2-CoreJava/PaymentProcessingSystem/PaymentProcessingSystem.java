public class PaymentProcessingSystem {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard("1234567890123456", "John Doe", "12/23", "123");
        PaymentMethod payPal = new PayPal("john.doe@example.com", "securepassword");

        creditCard.processPayment(100.0);
        payPal.processPayment(200.0);
    }
}