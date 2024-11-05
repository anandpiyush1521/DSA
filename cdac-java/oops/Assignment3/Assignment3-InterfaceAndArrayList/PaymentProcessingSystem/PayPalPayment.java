public class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Payment of $" + amount + " processed using PayPal.");
            return true;
        }
        return false;
    }

    @Override
    public String getPaymentDetails() {
        return email;
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed back to PayPal account.");
    }
}
