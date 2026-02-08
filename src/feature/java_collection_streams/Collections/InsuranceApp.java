package feature.java_collection_streams.Collections;

import java.time.LocalDate;

public class InsuranceApp {
    public static void main(String[] args) {
        InsuranceManager manager = new InsuranceManager();

        manager.addPolicy(new Policy("P101", "Komal", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P102", "Aman", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P103", "Komal", LocalDate.now().minusDays(5)));

        System.out.println("Policies expiring soon:");
        manager.getPoliciesExpiringSoon().forEach(System.out::println);

        System.out.println("\nPolicies for Komal:");
        manager.getPoliciesByHolder("Komal").forEach(System.out::println);

        manager.removeExpiredPolicies();

        System.out.println("\nSorted by Expiry Date:");
        manager.displaySortedByExpiry();
    }
}