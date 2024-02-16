package Interfaces.Question4;

abstract class BankAccount {
    void deposit(double amount){
        if(this instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) this;
            savingsAccount.setBalance(savingsAccount.getBalance() + amount);
        } else {
            CheckingAccount checkingAccount = (CheckingAccount) this;
            checkingAccount.setBalance(checkingAccount.getBalance() + amount);
        }
    }

    void withdraw(double amount) {
        if(this instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) this;
            savingsAccount.setBalance(savingsAccount.getBalance() - amount);
        } else {
            CheckingAccount checkingAccount = (CheckingAccount) this;
            checkingAccount.setBalance(checkingAccount.getBalance() - amount);
        }
    }

    void displayBalance() {
        if(this instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) this;
            System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        } else {
            CheckingAccount checkingAccount = (CheckingAccount) this;
            System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
        }
    }
}

class SavingsAccount extends BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if(amount <= 5000) {
            this.balance += amount;
        } else {
            System.out.println("The overdraft amount is above the allowable limits");
        }
    }
    void withdraw(double amount) {
        if(this.balance >= amount)
            this.balance -= amount;
        else if(amount <= 10000)
            this.balance -= amount;
        else
            System.out.println("The overdraft amount is above the allowable limits");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new SavingsAccount();
        bankAccount.deposit(700);
        bankAccount.displayBalance();

        bankAccount = new CheckingAccount();
        bankAccount.deposit(5000);
        bankAccount.withdraw(100);
        bankAccount.displayBalance();
        bankAccount.withdraw(15000);
    }
}
