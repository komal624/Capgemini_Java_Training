class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 101;
        acc.holderName = "Komal";
        acc.balance = 5000;

        acc.deposit(2000);
        acc.withdraw(1500);
        acc.displayBalance();
    }
}
