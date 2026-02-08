package feature.java_collection_streams.Collections;

public class BankingApp {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount("ACC101", 5000);
        bank.addAccount("ACC102", 15000);
        bank.addAccount("ACC103", 8000);

        bank.requestWithdrawal("ACC101");
        bank.requestWithdrawal("ACC103");

        bank.processWithdrawals(3000);
        System.out.println();
        bank.displaySortedByBalance();
    }
}
