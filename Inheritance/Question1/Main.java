package Inheritance.Question1;

class Account {
    private long accountNumber;
    private double balance;
    private String accountHolder;

    public Account(long accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

    public void calculateInterest() {
        System.out.println("Interest: " + this.getBalance() * 0.35);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(long accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

    public void handleOverdraft(double amount) {
        if(amount <= this.getBalance()) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Balance is sufficient");
        } else if((amount > this.getBalance()) && Math.abs(this.getBalance() - amount) <= 10000) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Amount is within Overdraft Limit");
        }
        else
            System.out.println("Amount exceeds Overdraft Limit");
    }
}
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(25653625387632L, 15000.0, "Kabilan");
        savingsAccount.calculateInterest();

        CurrentAccount currentAccount = new CurrentAccount(71232324834324L,20000.0,"Ram");
        currentAccount.handleOverdraft(1000);
        currentAccount.handleOverdraft(25000);
        currentAccount.handleOverdraft(5000);
    }
}
