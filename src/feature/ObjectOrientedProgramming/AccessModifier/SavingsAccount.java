package feature.ObjectOrientedProgramming.AccessModifiers;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    // Runnable
    public static void main(String[] args) {
        SavingsAccount s1 =
                new SavingsAccount(2001, "Amit", 3000);

        // Accessing public and protected members
        System.out.println("Account Number: " + s1.accountNumber);
        System.out.println("Account Holder: " + s1.accountHolder);
        System.out.println("Balance: " + s1.getBalance());
    }
}

