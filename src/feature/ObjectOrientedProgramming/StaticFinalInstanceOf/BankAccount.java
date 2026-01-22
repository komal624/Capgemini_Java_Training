package feature.ObjectOrientedProgramming.StaticFinalInstanceOf;

public class BankAccount {

    // Static (shared across all accounts)
    static String bankName = "National Bank";
    static int totalAccounts = 0;

    // Final (cannot be changed once assigned)
    final int accountNumber;

    // Instance variable
    String accountHolderName;

    // Constructor using this
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display method
    void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("----------------------");
    }

    // Runnable + instanceof demo
    public static void main(String[] args) {

        Object obj = new BankAccount("Komal", 101);

        // instanceof check
        if (obj instanceof BankAccount) {
            BankAccount acc1 = (BankAccount) obj;
            acc1.displayDetails();
        }

        BankAccount acc2 = new BankAccount("Amit", 102);
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
