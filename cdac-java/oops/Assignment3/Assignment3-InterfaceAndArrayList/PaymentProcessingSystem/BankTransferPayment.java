public class BankTransferPayment implements PaymentMethod {
    private String bankAccountNumber;
    private String bankName;

    public BankTransferPayment(String bankAccountNumber, String bankName) {
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Payment of $" + amount + " processed using Bank Transfer.");
            return true;
        }
        return false;
    }

    @Override
    public String getPaymentDetails() {
        return "Bank Account: " + bankAccountNumber + ", Bank Name: " + bankName;
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed back to Bank Account.");
    }
}
