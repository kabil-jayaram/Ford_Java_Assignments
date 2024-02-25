package Abstract_Class.Question4;

abstract class Account {
    String accountNumber;
    double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingAccount extends Account {
    public SavingAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Balance after deposit of " + amount + " is " + this.balance);
    }
    void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Balance after withdraw of " + amount + " is " + this.balance);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Balance after deposit of " + amount + " is " + this.balance);
    }
    void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Balance after withdraw of " + amount + " is " + this.balance);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SA001", 5000);
        savingAccount.deposit(2000);

        CurrentAccount currentAccount = new CurrentAccount("CA001", 10000);
        currentAccount.withdraw(2500);
    }
}
