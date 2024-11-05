public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding the calculateBalance method, considering overdraft limit
    public double calculateBalance(){
        if(balance<0 && Math.abs(balance) > overdraftLimit){
            System.out.println("Overdraft limit exceed, Extra fees will apply");
            return balance-100; //100 rs fee charge
        }
        return balance;
    }
}
