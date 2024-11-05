public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    //override calculateBalance method to include interset rate
    @Override
    public double calculateBalance(){
        return balance + (balance * interestRate/100);
    }
}
