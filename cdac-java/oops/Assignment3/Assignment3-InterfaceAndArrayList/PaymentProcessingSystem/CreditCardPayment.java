public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) {
        // Simple validation for the sake of example
        if (amount > 0 && validateCard()) {
            System.out.println("Payment of $" + amount + " processed using Credit Card.");
            return true;
        }
        return false;
    }

    private boolean validateCard() {
        return true; 
    }

    @Override
    public String getPaymentDetails() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4); // Masked card number
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed back to Credit Card.");
    }
}
