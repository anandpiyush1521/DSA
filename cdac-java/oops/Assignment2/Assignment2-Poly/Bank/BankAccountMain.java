public class BankAccountMain {
    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount("S7854545", 54000, 10);
        System.out.println("Savings Account Balance after Interest: $" + savingsAccount.calculateBalance());

        CheckingAccount checkingAccount = new CheckingAccount("S7854545", 54000, 100000);
        System.out.println("Checking Account Balance after Interest: $" + checkingAccount.calculateBalance());

        // Creating an instance of CheckingAccount
        // CheckingAccount checkingAccount = new CheckingAccount("CA456", -500, 1000); // Overdraft limit of $1000
        // System.out.println("Checking Account Balance: $" + checkingAccount.calculateBalance());

        // Example with overdraft limit exceeded
        // CheckingAccount checkingAccountExceed = new CheckingAccount("CA789", -1200, 1000); // Overdraft limit exceeded
        // System.out.println("Checking Account Balance (Overdraft Exceeded): $" + checkingAccountExceed.calculateBalance());
    }   
}
