package feature.ObjectOrientedProgramming.ObjectModeling;

public class Customer {

    String name;
    double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}
