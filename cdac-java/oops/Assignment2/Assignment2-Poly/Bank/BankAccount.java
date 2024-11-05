public class BankAccount {
    protected String accountNumber;
    protected double balance;
    
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //method to calculate balance
    public double calculateBalance() {
        return balance;
    }
}
