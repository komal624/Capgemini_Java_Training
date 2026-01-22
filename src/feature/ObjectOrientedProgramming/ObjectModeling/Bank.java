package feature.ObjectOrientedProgramming.ObjectModeling;

import java.util.ArrayList;

public class Bank {

    String bankName;
    ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Association method
    void openAccount(Customer customer, double initialDeposit) {
        customer.balance = initialDeposit;
        customers.add(customer);
        System.out.println(customer.name + " opened account in " + bankName);
    }

    // Runnable
    public static void main(String[] args) {

        Bank bank = new Bank("National Bank");

        Customer c1 = new Customer("Komal");
        Customer c2 = new Customer("Amit");

        bank.openAccount(c1, 5000);
        bank.openAccount(c2, 3000);

        c1.viewBalance();
        c2.viewBalance();
    }
}

