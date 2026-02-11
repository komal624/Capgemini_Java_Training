package feature.java_collection_streams.Collections;

import java.util.*;

public class BankingSystem {

    private HashMap<String, Double> accounts = new HashMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void addAccount(String accNo, double balance) {
        accounts.put(accNo, balance);
    }

    public void requestWithdrawal(String accNo) {
        withdrawalQueue.add(accNo);
    }

    // Process queue
    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            String accNo = withdrawalQueue.poll();
            double balance = accounts.getOrDefault(accNo, 0.0);

            if (balance >= amount) {
                accounts.put(accNo, balance - amount);
                System.out.println("Withdrawal successful for " + accNo);
            } else {
                System.out.println("Insufficient balance for " + accNo);
            }
        }
    }

    // Sort by balance
    public void displaySortedByBalance() {
        TreeMap<Double, String> sorted = new TreeMap<>();
        for (String acc : accounts.keySet()) {
            sorted.put(accounts.get(acc), acc);
        }

        System.out.println("Accounts Sorted by Balance:");
        for (Double balance : sorted.keySet()) {
            System.out.println(sorted.get(balance) + " -> ₹" + balance);
        }
    }
}