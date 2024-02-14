package Code.Question5;

interface BankAccount {
    public void displayBalance();
    public void performTransaction(double amount, String type);
}

class SavingsAccount implements BankAccount {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void displayBalance() {
        System.out.println("Balance: " + this.getBalance());
    }

    public void performTransaction(double amount, String type) {
        if(type.equalsIgnoreCase("withdraw")) {
            this.balance -= amount;
        } else {
            this.balance += amount;
        }
    }
}

class CheckingAccount implements BankAccount {
    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void displayBalance() {
        System.out.println("Balance: " + this.getBalance());
    }

    public void performTransaction(double amount, String type) {
        if(type.equalsIgnoreCase("withdraw") && amount <= 10000) {
            this.balance -= amount;
        } else if(type.equalsIgnoreCase("deposit") && amount <= 5000) {
            this.balance += amount;
        } else {
            System.out.println("The overdraft amount is above the allowable limits");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(50000);
        BankAccount bankAccount = savingsAccount;
        bankAccount.displayBalance();
        bankAccount.performTransaction(1000, "Withdraw");
        bankAccount.displayBalance();
        bankAccount.performTransaction(5000, "Deposit");
        bankAccount.displayBalance();

        CheckingAccount checkingAccount = new CheckingAccount(100000);
        bankAccount = checkingAccount;
        bankAccount.displayBalance();
        bankAccount.performTransaction(1000, "Withdraw");
        bankAccount.displayBalance();
        bankAccount.performTransaction(5000, "Deposit");
        bankAccount.displayBalance();
        bankAccount.performTransaction(15000, "Withdraw");
    }
}
