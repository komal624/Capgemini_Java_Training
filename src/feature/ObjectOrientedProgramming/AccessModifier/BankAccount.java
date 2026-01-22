package feature.ObjectOrientedProgramming.AccessModifiers;

public class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accNo, String holder, double balance) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = balance;
    }

    // Public methods to modify private balance
    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    // Runnable
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001, "Komal", 5000);
        System.out.println("Balance: " + b1.getBalance());

        b1.deposit(1000);
        System.out.println("Updated Balance: " + b1.getBalance());
    }
}
