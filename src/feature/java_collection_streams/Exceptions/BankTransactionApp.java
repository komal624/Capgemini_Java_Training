package feature.java_collection_streams.Exceptions;

public class BankTransactionApp {
public static void main(String[] args) {

    BankAccount account = new BankAccount(1000);

    try {
        account.withdraw(1500);
    } catch (InsufficientBalanceException e) {
        System.out.println(e.getMessage());
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}
}
