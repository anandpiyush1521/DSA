public interface PaymentMethod {
    boolean processPayment(double amount);
    String getPaymentDetails();
    void refund(double amount);
}
