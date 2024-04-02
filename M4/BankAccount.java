public class BankAccount {
    // the attributes
    private String account Number;
    private String accountName;
    private double balance;
    // the methods
    // the constructor
    public BankAccount(String numberIn, String name In) {
        account Number = numberIn;
        accountName = nameIn;
        balance = 0;
    }
    // methods to read the attributes
    public String getAccountName() {
        return accountName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    // methods to deposit and withdraw money public void deposit (double amountIn)
    balance balance + amountIn;
}
public boolean withdraw(double amountIn) {
    if (amount In > balance) {
        return false; // no withdrawal was made
    } else {
        balance
            =
            balance amountIn;
        return true; // money was withdrawn successfully
    }
}
