public class BankAccountStaticDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("987654321", "Jane Smith", 2000.0);
        
        account1.deposit(500.0);
        account2.withdraw(1000.0);
        
        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Account 1 balance: $" + account1.getBalance());
        System.out.println("Account 2 balance: $" + account2.getBalance());
    }
}

/*
Sample Run:

Deposit of $500.0 successful. New balance: $1500.0
Withdrawal of $1000.0 successful. New balance: $1000.0
Total number of accounts: 2
Account 1 balance: $1500.0
Account 2 balance: $1000.0
*/
